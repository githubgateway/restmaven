package com.hackathon.restapi.restservices.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hackathon.restapi.restservices.parser.SaxXMLParser;

@RestController
@RequestMapping("/api")
public class RestServiceController {
	
	@RequestMapping(value="/GetKnowledgeArticle",method=RequestMethod.GET)	
	@ResponseBody
	public String GetKnowledgeArticle(){
		
		String plainCreds = "integration:1234";
		byte[] plainCredsBytes = plainCreds.getBytes();
		byte[] base64CredsBytes = org.apache.tomcat.util.codec.binary.Base64.encodeBase64(plainCredsBytes);
		String base64Creds = new String(base64CredsBytes);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + base64Creds);
		headers.add("Content-type", "application/xml");
		headers.add("Accept", "application/xml");
		
		String uri = "https://dev19808.service-now.com/api/now/table/kb_knowledge";
		RestTemplate restTemplate = new RestTemplate();
	    	   
	    HttpEntity<String> request = new HttpEntity<String>(headers);
	    ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.GET, request, String.class);	        
	    System.out.println(response.getBody());	 
	    
	    new SaxXMLParser(response.getBody());
	    return response.getBody();
	}
}
