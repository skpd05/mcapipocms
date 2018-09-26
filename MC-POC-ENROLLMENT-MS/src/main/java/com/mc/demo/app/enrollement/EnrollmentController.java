package com.mc.demo.app.enrollement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mc.demo.app.enrollement.service.EnrollService;

@RestController
@RequestMapping("/v1/api/loyalty/enroll")
public class EnrollmentController {



	@Autowired
	EnrollService enrollService;

	@RequestMapping(value = "/validateCard", method = RequestMethod.POST)
	public ResponseEntity<CardEnrolled> validateEnrollment(@RequestBody EnrollCard enrollCard) {

		CardEnrolled cardEnrolled ;
		try {
			cardEnrolled = enrollService.validateCard(enrollCard);
		} catch (Exception e) {
			
			return new ResponseEntity<CardEnrolled>(new CardEnrolled(), HttpStatus.PRECONDITION_FAILED);
		}

		return new ResponseEntity<CardEnrolled>(cardEnrolled, HttpStatus.OK);
	}

	@RequestMapping(value = "/checkUserID/{userid}", method = RequestMethod.GET)
	public String verifyUserId(@PathVariable(value = "userid") String userid) {
		if (enrollService.isUserIdAvailable(userid)) {
			return "available";
		}

		return "taken";

	}

	@RequestMapping(value = "/createProfile", method = RequestMethod.POST)
	public ResponseEntity<CardEnrolled> createUserProfile(@RequestBody UserProfile userprofile) {

		CardEnrolled cardEnroll = new CardEnrolled();
		try {
			enrollService.createUserProfile(userprofile);
			cardEnroll.setCardNumber(userprofile.getACCOUNTNUMBER());
			cardEnroll.setUserid(userprofile.getEMAILID());
			cardEnroll.setEnrolledAlready(false);
			cardEnroll.setMessage("User created successfully");
		} catch (Exception e) {
			e.printStackTrace();
			cardEnroll.setCardNumber(userprofile.getACCOUNTNUMBER());
			cardEnroll.setEnrolledAlready(false);
			cardEnroll.setMessage("User creation failed");
		}
		return new ResponseEntity<CardEnrolled>(cardEnroll, HttpStatus.OK);
	}

	@RequestMapping(value = "/ulogin", method = RequestMethod.POST)
	public ResponseEntity<LoginResponse> loginUser(@RequestBody UserProfile userprofile) {
			return new ResponseEntity<LoginResponse> (enrollService.ulogin(userprofile),HttpStatus.OK);
		}
	
	
}
