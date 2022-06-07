package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC004_GET_Request {
	@Test
	 void googleMapTest()
	 {
	  
	  //Specify base URI
	  RestAssured.baseURI="https://reqres.in/api/users";
	  
	  //Request object
	  RequestSpecification httpRequest=RestAssured.given();
	  
	  //Response object
	  Response response=httpRequest.request(Method.GET,"?page=2");
	  
	  //print response in console window
	  String responseBody=response.getBody().asString();
	  System.out.println("Response Body is:" +responseBody);
	  
	  // verify the response body contains
	  Assert.assertEquals(responseBody.contains("per_page"), true);
	  
	  JsonPath jp = response.jsonPath();
	  System.out.println(jp.get("total"));
	  
	 }
}
