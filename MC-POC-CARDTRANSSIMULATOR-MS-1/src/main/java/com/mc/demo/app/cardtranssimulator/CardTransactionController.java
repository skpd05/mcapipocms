package com.mc.demo.app.cardtranssimulator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mc.demo.app.cardtranssimulator.model.Cardtransaction;
import com.mc.demo.app.cardtranssimulator.service.CardTransactionService;

@RestController
@RequestMapping("/api/v1/simulate/card")
public class CardTransactionController {

	@Autowired
	CardTransactionService transService;

	@RequestMapping(value = "/gettransactions/{cardnumber}", method = RequestMethod.GET)
	public ResponseEntity<List<Cardtransaction>> getTransactionHistory(@PathVariable String cardnumber) {
		return new ResponseEntity<List<Cardtransaction>>(transService.getTransactionHistory(cardnumber), HttpStatus.OK);
	}

	@RequestMapping(value = "/savetransaction", method = RequestMethod.POST)
	public String saveTransaction(@RequestBody CreditCardTransaction transaction) {
		transService.saveTransaction(transaction);
		return "Success";

	}

}
