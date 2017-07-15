package com.app.login.POJO;

public class ContactBook
{
	private int id;
	private int qid;
	private String name;
	private String address;
	private String dob;
	private String telno;
	private String landno;
	private String website;
	private String companyName;
	
	public ContactBook()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ContactBook(String name, String address, String dob, String telno, String landno, String website,
			String companyName) {
		super();
		//this.id = id;
		//this.qid = qid;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.telno = telno;
		this.landno = landno;
		this.website = website;
		this.companyName = companyName;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	public String getLandno() {
		return landno;
	}
	public void setLandno(String landno) {
		this.landno = landno;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
