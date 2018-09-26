/**
 * 
 */
package com.mc.demo.app.redeem;

import java.sql.Timestamp;

/**
 * @author Wipro
 *
 */
public class RedemptionTransaction {

	private String custid;
	private String cardnumber;
	private double redeemedpoints;
	private String quantity;
	private Timestamp redemptiontimestaamp;
	private String redeemeditem;
	private String vendorid;
	/**
	 * @return the custid
	 */
	public String getCustid() {
		return custid;
	}
	/**
	 * @param custid the custid to set
	 */
	public void setCustid(String custid) {
		this.custid = custid;
	}
	/**
	 * @return the redeemedpoints
	 */
	public double getRedeemedpoints() {
		return redeemedpoints;
	}
	/**
	 * @param redeemedpoints the redeemedpoints to set
	 */
	public void setRedeemedpoints(double redeemedpoints) {
		this.redeemedpoints = redeemedpoints;
	}
	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the redemptiontimestaamp
	 */
	public Timestamp getRedemptiontimestaamp() {
		return redemptiontimestaamp;
	}
	/**
	 * @param redemptiontimestaamp the redemptiontimestaamp to set
	 */
	public void setRedemptiontimestaamp(Timestamp redemptiontimestaamp) {
		this.redemptiontimestaamp = redemptiontimestaamp;
	}
	/**
	 * @return the redeemeditem
	 */
	public String getRedeemeditem() {
		return redeemeditem;
	}
	/**
	 * @param redeemeditem the redeemeditem to set
	 */
	public void setRedeemeditem(String redeemeditem) {
		this.redeemeditem = redeemeditem;
	}
	/**
	 * @return the vendorid
	 */
	public String getVendorid() {
		return vendorid;
	}
	/**
	 * @param vendorid the vendorid to set
	 */
	public void setVendorid(String vendorid) {
		this.vendorid = vendorid;
	}
	/**
	 * @return the cardnumber
	 */
	public String getCardnumber() {
		return cardnumber;
	}
	/**
	 * @param cardnumber the cardnumber to set
	 */
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	
	
}
