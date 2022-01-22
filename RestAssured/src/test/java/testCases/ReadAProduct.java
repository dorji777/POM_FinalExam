package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class ReadAProduct {
	
	@Test
	public void readAProduct() {
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
			.headers("content-Type","application/json;")
			.queryParam("id","2896")
			.auth().preemptive().basic("userName","password")
			.header("Authorization","Bearer FFXGHJGJDGGDHGHGE456@34").
			
		when()
			.get("/read_one.php").
		then()
			.extract().response();
		
		int actualstatuscode = response.getStatusCode();
		System.out.println("actualstatuscode: " + actualstatuscode);
		Assert.assertEquals(actualstatuscode,200);
		
		String actualHeader=response.getHeader("content-Type");
		Assert.assertEquals(actualHeader,"application/json");
		System.out.println("actualHeader: " + actualHeader);
		
		
		String responseBody=response.getBody().asString();
		System.out.println("responseBody:" + responseBody);
		
		JsonPath jp = new JsonPath(responseBody);
		System.out.println("jp: "+ jp.prettyPrint());
		
		String productId=jp.get("id");
		System.out.println("productId: "+ productId);
		Assert.assertEquals(productId,"2896");
		
		String productPrice=jp.get("price");
		System.out.println("productPrice: "+ productPrice);
		Assert.assertEquals(productPrice,"999");
		
		
		
	}
	
}
