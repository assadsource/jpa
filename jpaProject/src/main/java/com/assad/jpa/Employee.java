package com.assad.jpa;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
@Access(AccessType.FIELD)
public class Employee {
	public static final String LOCAL_AREA_CODE = "0088";
	
	@Id private int id;
	@Transient private String phoneNum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	@Access(AccessType.PROPERTY) @Column(name="PHONE")
	protected String getPhoneNumberForDb() {
		if(phoneNum.length() == 10) {
			return phoneNum;
		} else {
			return LOCAL_AREA_CODE + phoneNum;
		}
	}
	
	protected void setPhoneNumberForDb(String num) {
		if(num.startsWith(LOCAL_AREA_CODE)){
			phoneNum = num.substring(3);
		} else {
			phoneNum = num;
		}
	}
	
}
