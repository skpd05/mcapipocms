package com.mc.demo.app.cardtranssimulator.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CardTransacRepository extends CrudRepository<Cardtransaction, Integer> {

	public List<Cardtransaction> findTransactionByAccountnumber(String accountnumber);
}
