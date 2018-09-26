package com.mc.demo.app.redeem;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mc.demo.app.redeem.service.RedemptionService;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api/v1/loyalty/redemption")
public class RedeemServiceController {

	@Autowired
	RedemptionService redeemService;

	
	@RequestMapping(value = "/savetransaction", method = RequestMethod.POST)
	public String redeemPoints(@RequestBody RedemptionTransaction redeem) {

		if (redeemService.save(redeem)) {
			return "succesful";
		}
		return "unsuccessful";
	}

	@RequestMapping(value = "/historybycard/{cardnumber}", method = RequestMethod.GET)
	
	public ResponseEntity<List<RedemptionTransaction>> getHistorybyCardNumber(@PathVariable String cardnumber) {
		List<RedemptionTransaction> historyList = redeemService.getHistoryByCard(cardnumber);
		if(null == historyList)
		{
			return new ResponseEntity<List<RedemptionTransaction>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<RedemptionTransaction>>(historyList,HttpStatus.OK);
	}

	
	@RequestMapping(value = "/historybycustId/{custid}", method = RequestMethod.GET)
	public ResponseEntity<List<RedemptionTransaction>>  getHistorybyCustID(@PathVariable String custid) {
		List<RedemptionTransaction> historyList = redeemService.getHistoryByCustomerID(custid);
		if(null == historyList)
		{
			return new ResponseEntity<List<RedemptionTransaction>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<RedemptionTransaction>>(historyList,HttpStatus.OK);
	}

}
