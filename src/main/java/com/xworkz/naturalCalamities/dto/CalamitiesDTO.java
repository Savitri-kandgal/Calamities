package com.xworkz.naturalCalamities.dto;

import java.util.Date;

public class CalamitiesDTO {

	private int cId;
	private String place;
	private Date date;
	private String capturedBy;
	private String type;
	private String area;
	private String avgLoss;
	private String noOfDeath;
	private String noOfInjured;

	public CalamitiesDTO() {
		System.out.println("create :" + this.getClass().getSimpleName());
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCapturedBy() {
		return capturedBy;
	}

	public void setCapturedBy(String capturedBy) {
		this.capturedBy = capturedBy;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAvgLoss() {
		return avgLoss;
	}

	public void setAvgLoss(String avgLoss) {
		this.avgLoss = avgLoss;
	}

	public String getNoOfDeath() {
		return noOfDeath;
	}

	public void setNoOfDeath(String noOfDeath) {
		this.noOfDeath = noOfDeath;
	}

	public String getNoOfInjured() {
		return noOfInjured;
	}

	public void setNoOfInjured(String noOfInjured) {
		this.noOfInjured = noOfInjured;
	}

	@Override
	public String toString() {
		return "CalamitiesDTO [cId=" + cId + ", place=" + place + ", date=" + date + ", capturedBy=" + capturedBy
				+ ", type=" + type + ", area=" + area + ", avgLoss=" + avgLoss + ", noOfDeath=" + noOfDeath
				+ ", noOfInjured=" + noOfInjured + "]";
	}

}
