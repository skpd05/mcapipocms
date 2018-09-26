/**
 * 
 */
package com.mc.demo.app.enrollement.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Wipro
 *
 */
public interface AccountRepository extends CrudRepository<Account, Integer> {
	
	// public List<Account> findByAccountnumber(String accountnumber);
	public Account findByAccountnumber(String accountnumber);

}
