package com.capgemini.dnd.dto;


public class Supplier {
 
	private String supplierId;
	private String name;
	private String address;
	private String emailId;
	private int phoneNo;

	public Supplier(String supplierId, String name, String address, String emailId, int phoneNo) {
		this.supplierId = supplierId;
		this.name = name;
		this.address = address;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
	}

	public Supplier() {
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", name=" + name + ", address=" + address + ", emailId=" + emailId
				+ ", phoneNo=" + phoneNo + "]";
	}


}