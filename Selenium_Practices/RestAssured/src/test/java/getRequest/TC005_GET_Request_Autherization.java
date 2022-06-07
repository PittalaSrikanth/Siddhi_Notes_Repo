package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TC005_GET_Request_Autherization 
{
	@Test

	public void AutherizationTest()
	{
		//Specify base URI
		RestAssured.baseURI="http://restapi.demoga.com/authentication/CheckForAuthentication";
	
		//Basic authentication
		PreemptiveBasicAuthScheme authscheme=new PreemptiveBasicAuthScheme(); 
		authscheme.setUserName("ToolsQA"); 
		authscheme.setPassword("TestPassword");
		RestAssured.authentication = authscheme;
	
		//Request object
		RequestSpecification httpRequest=RestAssured.given();
	
		//Response object
		Response response=httpRequest.request (Method.GET,"/");
	
		//print response in console window
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is: " +responseBody);
		
		//status code validation
		int statusCode = response.getStatusCode();
		System.out.println("status code is :" + statusCode);
		Assert.assertEquals(statusCode, true);
	
	}
}
