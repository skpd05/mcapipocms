package com.mc.demo.app.redeem.service;

import java.util.List;

import com.mc.demo.app.redeem.RedemptionTransaction;

public interface RedemptionService {
	
	public boolean save(RedemptionTransaction transcation);
	
	public List<RedemptionTransaction> getHistoryByCard(String cardnumber);
	
	public List<RedemptionTransaction> getHistoryByCustomerID(String custId);

}
