package com.mc.demo.app.enrollement.service;

import com.mc.demo.app.enrollement.CardEnrolled;
import com.mc.demo.app.enrollement.EnrollCard;
import com.mc.demo.app.enrollement.LoginResponse;
import com.mc.demo.app.enrollement.UserProfile;


public interface EnrollService {
	
	public CardEnrolled validateCard(EnrollCard enrollCard) throws Exception;
	
	public boolean createUserProfile(UserProfile userProfile);
	
	public boolean isUserIdAvailable(String userid);
	
	public LoginResponse ulogin(UserProfile userProfile);
		
}
