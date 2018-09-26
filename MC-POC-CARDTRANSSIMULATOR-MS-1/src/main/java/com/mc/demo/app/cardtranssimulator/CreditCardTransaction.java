package com.mc.demo.app.cardtranssimulator;

import java.sql.Timestamp;

public class CreditCardTransaction {
	
	private String transactionId;
	private String creditCardNumber;
	private String merchantname;
	private String merchantid;
	private String transcationtype;
	private String transactionamount;
	private String city;
	private String state;
	private Timestamp transactionTimestamp;
	
	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}
	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	/**
	 * @return the creditCardNumber
	 */
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	/**
	 * @param creditCardNumber the creditCardNumber to set
	 */
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	/**
	 * @return the transcationtype
	 */
	public String getTranscationtype() {
		return transcationtype;
	}
	/**
	 * @param transcationtype the transcationtype to set
	 */
	public void setTranscationtype(String transcationtype) {
		this.transcationtype = transcationtype;
	}
	/**
	 * @return the transactionamount
	 */
	public String getTransactionamount() {
		return transactionamount;
	}
	/**
	 * @param transactionamount the transactionamount to set
	 */
	public void setTransactionamount(String transactionamount) {
		this.transactionamount = transactionamount;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the transactionTimestamp
	 */
	public Timestamp getTransactionTimestamp() {
		return transactionTimestamp;
	}
	/**
	 * @param transactionTimestamp the transactionTimestamp to set
	 */
	public void setTransactionTimestamp(Timestamp transactionTimestamp) {
		this.transactionTimestamp = transactionTimestamp;
	}
	/**
	 * @return the merchantname
	 */
	public String getMerchantname() {
		return merchantname;
	}
	/**
	 * @param merchantname the merchantname to set
	 */
	public void setMerchantname(String merchantname) {
		this.merchantname = merchantname;
	}
	/**
	 * @return the merchantid
	 */
	public String getMerchantid() {
		return merchantid;
	}
	/**
	 * @param merchantid the merchantid to set
	 */
	public void setMerchantid(String merchantid) {
		this.merchantid = merchantid;
	}
	

}
