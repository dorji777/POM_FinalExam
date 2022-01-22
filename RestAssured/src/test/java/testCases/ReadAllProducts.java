package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class ReadAllProducts {
	
	@Test
	public void readAllProducts() {
		/*
		 given: all input details(base URI,Headers,Payload/Body,QueryParameters)
		 when:  submit api requests(Http method,Endpoint/Resource)
		 then:  validate response(status code, Headers, responseTime, Payload/Body)
		 baseURI https://techfios.com/api-prod/api/product
         Endpoint/Resource: /read.php
		 */
		
		Response response =
		given()
			.baseUri("https://techfios.com/api-prod/api/product")
			.headers("content-Type","application/json; charset=UTF-8").
		when()
			.get("/read.php").
		then()
			.extract().response();
		
		int actualstatuscode = response.getStatusCode();
		System.out.println("actualstatuscode: " + actualstatuscode);
		Assert.assertEquals(actualstatuscode,200);
		
		String actualHeader=response.getHeader("content-Type");
		Assert.assertEquals(actualHeader,"application/json; charset=UTF-8");
		System.out.println("actualHeader: " + actualHeader);
		
		
		String responseBody=response.getBody().asString();
		System.out.println("responseBody:" + responseBody);
		
	}
	
}
