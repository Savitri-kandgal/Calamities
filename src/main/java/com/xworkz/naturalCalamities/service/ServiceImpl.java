package com.xworkz.naturalCalamities.service;

import java.util.Date;
import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.naturalCalamities.dao.CalamitiesDAO;
import com.xworkz.naturalCalamities.dto.CalamitiesDTO;
import com.xworkz.naturalCalamities.entity.CalamitiesEntity;

@Component
public class ServiceImpl implements CalamitiesService {

	@Autowired
	private CalamitiesDAO dao;
	
	public ServiceImpl() {
		System.out.println("Created :"+this.getClass().getSimpleName());
	}

	@Override
	public int validateAndCreate(CalamitiesDTO dto) {
		System.out.println("invoked validateAndCreate in service :" + dto);

		int valid = 1;
		try {
			if (Objects.nonNull(dto)) {
				System.out.println("starting to validate fields");

				String place = dto.getPlace();
				if (place != null && !place.isEmpty()) {
					System.out.println("palce is valid");
					valid = 0;
				} else {
					System.out.println("place is invalid");
					valid = 1;
				}

				Date date = dto.getDate();
				if (valid == 0 && date != null) {
					System.out.println("date is valid");
					valid = 0;
				} else {
					System.out.println("date is invalid");
					valid = 1;
				}

				String type = dto.getType();

				if (valid == 0 && type != null && !type.isEmpty()) {
					System.out.println("type is valid");
					valid = 0;
				} else {
					System.out.println("type is invalid");
					valid = 1;
				}

				if (valid == 0) {
					System.out.println("data is valid, can save");
					
					CalamitiesEntity entity=new CalamitiesEntity();
						System.out.println("copying data from dto to entity");		
						BeanUtils.copyProperties(dto, entity);
						dao.create(entity);
				
				}
			} else {
				System.out.println("data is invalid, cannot save dto");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return valid;
	}

}
