package dataDriverTest;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TC008_DD_GET_Request_DataProvider 
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
	public String[][] users_list() throws IOException
	{
		String filepath= "./src/test/java/dataDriverTest/userlist.xlsx";
		int rowcount = ExcelUtils.rowCount(filepath, "user");
		System.out.println(rowcount);
		
		int coloumcount = ExcelUtils.cellCount(filepath, "user",1);
		System.out.println(coloumcount);
		String users[][] = new String[rowcount][coloumcount];
		for(int i=1;i<=rowcount;i++) 
		{
			for(int j = 0;j<coloumcount;j++)
			{
				users[i-1][j] = ExcelUtils.CellDataByIndexes(filepath, "user", i, j);
			}
		}
		return users;
	}
}



































