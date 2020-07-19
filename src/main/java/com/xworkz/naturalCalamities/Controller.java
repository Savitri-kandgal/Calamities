package com.xworkz.naturalCalamities;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.naturalCalamities.dto.CalamitiesDTO;
import com.xworkz.naturalCalamities.service.CalamitiesService;

//below annotation is used to cerate an obj using spring 
@Component
@RequestMapping("/")
public class Controller {

	// controller has service -- hence dep injection
	// below annotation is used to inject or refer an obj managed by spring
	// framework,
	// before we use autowired we have to make sure obj is created by using
	// @component
	@Autowired
	private CalamitiesService service;

	public Controller() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}
	
	@InitBinder
	public void init(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
	@RequestMapping(value = "/report.odc", method = RequestMethod.POST)
	public String OnReport(CalamitiesDTO dto, Model model) {
		
		System.out.println("invoked OnReport()");
		System.out.println(dto);
		int valid = this.service.validateAndCreate(dto);
		if (valid == 0) {
			System.out.println("sending response to index.jsp");
			model.addAttribute("Place :" + dto.getPlace());
			model.addAttribute("Date : " + dto.getDate());
			model.addAttribute("Captured By :" + dto.getCapturedBy());
			model.addAttribute("dto", dto);
			return "Success";

		}
		System.out.println("data is invalid");
		model.addAttribute("error", "Please enter place, date and calamities type");
		return "index";

	}

}
