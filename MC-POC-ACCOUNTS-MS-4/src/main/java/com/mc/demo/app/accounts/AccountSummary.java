package com.mc.demo.app.accounts;

import java.util.ArrayList;
import java.util.List;

public class AccountSummary {

	private String customerID;
	private String firstName;
	private String lastName;
	private String ssn;
	private String dateofbirth;
	private String MMN;
	private String bankCustNumber;
	private String previousBankAccNumber;
	Address AddressObject;
	private List<Creditcard> creditcardsList ;

	// Getter Methods

	/**
	 * @return the creditcardsList
	 */
	public List<Creditcard> getCreditcardsList() {
		return creditcardsList;
	}

	/**
	 * @param creditcardsList the creditcardsList to set
	 */
	public void setCreditcardsList(List<Creditcard> creditcardsList) {
		this.creditcardsList = creditcardsList;
	}

	public String getCustomerID() {
		return customerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public String getMMN() {
		return MMN;
	}

	public String getBankCustNumber() {
		return bankCustNumber;
	}

	public String getPreviousBankAccNumber() {
		return previousBankAccNumber;
	}

	public Address getAddress() {
		return AddressObject;
	}

	// Setter Methods

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public void setMMN(String MMN) {
		this.MMN = MMN;
	}

	public void setBankCustNumber(String bankCustNumber) {
		this.bankCustNumber = bankCustNumber;
	}

	public void setPreviousBankAccNumber(String previousBankAccNumber) {
		this.previousBankAccNumber = previousBankAccNumber;
	}

	public void setAddress(Address addressObject) {
		this.AddressObject = addressObject;
	}
	
}

 class Address {
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zipcode;

	// Getter Methods

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipcode() {
		return zipcode;
	}

	// Setter Methods

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}
