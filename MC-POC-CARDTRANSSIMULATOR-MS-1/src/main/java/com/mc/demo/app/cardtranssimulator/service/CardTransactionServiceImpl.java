package com.mc.demo.app.cardtranssimulator.service;


import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.demo.app.cardtranssimulator.CreditCardTransaction;
import com.mc.demo.app.cardtranssimulator.model.CardTransacRepository;
import com.mc.demo.app.cardtranssimulator.model.Cardtransaction;

@Service("transService")
public class CardTransactionServiceImpl implements CardTransactionService {

	
	@Autowired
	CardTransacRepository transRepo;
	
	@Override
	public boolean saveTransaction(CreditCardTransaction cardTrans) {
		
		Cardtransaction transObj = new Cardtransaction();
		Random r = new Random();
		int inR = r.nextInt((9999999 - 2000000) + 1) + 2000000;
		transObj.setTransactionid(String.valueOf(inR));
		transObj.setAccountnumber(cardTrans.getCreditCardNumber());
		transObj.setMerchantname(cardTrans.getMerchantname());
		transObj.setMerchantid(cardTrans.getMerchantid());
		String transAmount = cardTrans.getTransactionamount();
		Double dbamount = Double.valueOf(transAmount);
		transObj.setPointscaluclated(dbamount*.05);
		transObj.setTransactionamount(cardTrans.getTransactionamount());
		transObj.setTransactiontimestamp(java.sql.Timestamp.valueOf("2018-11-15 15:30:14.332"));
		transObj.setTranscationtype(cardTrans.getTranscationtype());
		transObj.setCurrencycode("USD");
		transObj.setCity(cardTrans.getCity());
		transObj.setState(cardTrans.getState());
		transObj.setCreated_at(java.sql.Timestamp.valueOf("2018-11-15 15:30:14.332"));
		transObj.setUpdated_at(java.sql.Timestamp.valueOf("2018-11-15 15:30:14.332"));	
		transRepo.save(transObj);
		return false;
	}

	@Override
	public List<Cardtransaction> getTransactionHistory(String creditCardNumber) {
	
		return transRepo.findTransactionByAccountnumber(creditCardNumber);
		
	}

}
