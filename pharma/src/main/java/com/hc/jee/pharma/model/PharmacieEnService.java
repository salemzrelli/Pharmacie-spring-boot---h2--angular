package com.hc.jee.pharma.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PharmacieEnService {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date dateFrom;
	private Date dateTo;

	private String lieu;

	private String parmacieName;

	private String addres;

	private int phone;

	public PharmacieEnService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PharmacieEnService(Long id, Date dateFrom, Date dateTo, String lieu, String parmacieName, String addres, int phone) {
		super();
		this.id = id;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.lieu = lieu;
		this.parmacieName = parmacieName;
		this.addres = addres;
		this.phone = phone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getParmacieName() {
		return parmacieName;
	}

	public void setParmacieName(String parmacieName) {
		this.parmacieName = parmacieName;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}
