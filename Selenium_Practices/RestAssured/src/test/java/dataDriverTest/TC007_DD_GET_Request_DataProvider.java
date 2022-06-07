package dataDriverTest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TC007_DD_GET_Request_DataProvider 
{
	@Test(dataProvider = "new_users_list")
	 void AddUsers(String name, String job)
	 {
		//Specify base URI
		  RestAssured.baseURI="https://reqres.in/api";
		  
		  //Request object
		  RequestSpecification httpRequest=RestAssured.given();
		  
		   
		  //Request paylaod sending along with post request
		  JSONObject requestParams=new JSONObject();
		  
		  requestParams.put("name",name);
		  requestParams.put("job",job);
		  
		  httpRequest.header("Content-Type","application/json");
		  
		  httpRequest.body(requestParams.toJSONString()); // attach above data to the request
		  
		  //Response object
		  Response response=httpRequest.request(Method.POST,"/users");
		    
		  
		  //print response in console window
		  
		  String responseBody=response.getBody().asString();
		  System.out.println("Response Body is:" +responseBody);
		  
		  //status code validation
		  int statusCode=response.getStatusCode();
		  System.out.println("Status code is: "+statusCode);
		  Assert.assertEquals(statusCode, 201);
		  
		  //success code validation
		  String successCode=response.jsonPath().get("name");
		  Assert.assertEquals(successCode, name);
	  
	 }
	
	@DataProvider(name = "new_users_list")
	public String[][] users_list()
	{
		String users[][] = {{"srikanth","Automation"},{"sandeep","QA Lead"},{"sathish","Dev lead"}};
		return users;
	}
}
