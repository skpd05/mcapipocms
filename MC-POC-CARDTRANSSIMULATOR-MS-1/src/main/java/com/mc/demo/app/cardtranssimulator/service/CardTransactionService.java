package com.mc.demo.app.cardtranssimulator.service;

import java.util.List;

import com.mc.demo.app.cardtranssimulator.CreditCardTransaction;
import com.mc.demo.app.cardtranssimulator.model.Cardtransaction;


public interface CardTransactionService {

	public boolean saveTransaction(CreditCardTransaction cardTrans);
	
	public List<Cardtransaction> getTransactionHistory(String creditCardNumber);
}
