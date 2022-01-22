package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;
public class DeleteAProduct {
	
	@Test
	public void deleteAProduct() {
		
		
		
		Response response =
		given()
			.baseUri("https://techfios.com/api-prod/api/product")
			.headers("content-Type","application/json; charset=UTF-8")
//			.queryParam("id","2896")
			.body(new File("src\\main\\java\\data\\DeletePayLoad.json"))
//			.auth().preemptive().basic("userName","password")
			.header("Authorization","Bearer FFXGHJGJDGGDHGHGE456@34").
			
		when()
			.delete("/delete.php").
		then()
			.extract().response();
		
		int actualstatuscode = response.getStatusCode();
		System.out.println("actualstatuscode: " + actualstatuscode);
		Assert.assertEquals(actualstatuscode,200);
		
		String actualHeader=response.getHeader("content-Type");
		System.out.println("actualHeader: " + actualHeader);
		Assert.assertEquals(actualHeader,"application/json; charset=UTF-8");
		
		
		String responseBody=response.getBody().asString();
		System.out.println("responseBody:" + responseBody);
		
		JsonPath jp = new JsonPath(responseBody);
		System.out.println("jp: "+ jp.prettyPrint());
		
		String productMessage=jp.get("message");
		
		System.out.println("message: "+ productMessage);
		Assert.assertEquals(productMessage,"Product was deleted.");
		
		
		
	}
	
}
