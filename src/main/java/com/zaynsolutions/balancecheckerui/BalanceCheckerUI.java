
package com.zaynsolutions.balancecheckerui;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BalanceCheckerUI {


	@Value("${balancecheckurl}")
	private String balancecheckurl;
	
	
	@GetMapping(value = "/balancecheckui")
	private String balaceChecker()
	{
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(balancecheckurl, String.class);
	    return "Here I am printing Results :"+result; 
	}

	@RequestMapping("/")
	public String index() {
		System.out.println(LocalDateTime.now()+":/ url is called:");
		return "Balance Checker UI Application!";
	}

	
	
	
}