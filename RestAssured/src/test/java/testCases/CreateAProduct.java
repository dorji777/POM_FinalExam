package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;
public class CreateAProduct {
	
	@Test
	public void createAProduct() {

		HashMap<String,String> payload= new HashMap<String,String>();
		
		
		payload.put("name","Dorji's Amazing Pillow 6.0");
		payload.put("price","222");
		payload.put("description","The best pillow for amazing programmers.");
		payload.put("category_id","2");
	    
		
		Response response =
		given()
			.baseUri("https://techfios.com/api-prod/api/product")
			.headers("content-Type","application/json; charset=UTF-8")
//			.queryParam("id","2896")
//			.body(new File("src\\main\\java\\data\\CreatePayLoad.json")) //Using data (not HashMap)
			.body(payload) //Using HashMap
//			.auth().preemptive().basic("userName","password")
			.header("Authorization","Bearer FFXGHJGJDGGDHGHGE456@34").
			
		when()
			.post("/create.php").
		then()
			.extract().response();
		
		int actualstatuscode = response.getStatusCode();
		System.out.println("actualstatuscode: " + actualstatuscode);
		Assert.assertEquals(actualstatuscode,201);
		
		String actualHeader=response.getHeader("content-Type");
		System.out.println("actualHeader: " + actualHeader);
		Assert.assertEquals(actualHeader,"application/json; charset=UTF-8");
		
		
		String responseBody=response.getBody().asString();
		System.out.println("responseBody:" + responseBody);
		
		JsonPath jp = new JsonPath(responseBody);
		System.out.println("jp: "+ jp.prettyPrint());
		
		String productMessage=jp.get("message");
		
		System.out.println("message: "+ productMessage);
		Assert.assertEquals(productMessage,"Product was created.");
		
		
		
	}
	
}
