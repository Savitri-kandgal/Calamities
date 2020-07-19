package com.xworkz.naturalCalamities.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="calamities")
public class CalamitiesEntity implements Serializable {
	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="C_ID")
	private int cId;
	@Column(name="PLACE")
	private String place;
	@Column(name="DATE")
	//@Temporal(TemporalType.TIME)
	private Date date;
	@Column(name="CAPTURED_BY")
	private String capturedBy;
	@Column(name="TYPE")
	private String type;
	@Column(name="AREA")
	private String area;
	@Column(name="AVG_LOSS")
	private String avgLoss;
	@Column(name="NO_OF_DEATH")
	private String noOfDeath;
	@Column(name="NO_OF_INJURED")
	private String noOfInjured;
	
	public CalamitiesEntity() {
		System.out.println("create :"+this.getClass().getSimpleName());
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
