package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;// (.*)import everything under this class and no need to use RestAssued.get(url) directly use get(url)
import io.restassured.response.Response;


import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class TestExamples {

	
	
	@Test
	public void test_1() {
		
	Response response =	get("https://reqres.in/api/users?page=2"); //https://reqres.in/----Get (list Users) Request Link
	
	System.out.println(response.getStatusCode());
	
	System.out.println(response.getTime());
	
	System.out.println(response.getBody().asString());
	System.out.println(response.getStatusLine());
	System.out.println(response.getHeader("content-type"));
	
	
	int statusCode=response.getStatusCode();
	Assert.assertEquals(statusCode, 200);
	
	}
	@Test
	public void Test_2() {
	
		
	given().
	get("https://reqres.in/api/users?page=2").
	then().
	statusCode(200).body("data.id[2]", equalTo(9)).log().all();
	
	}}
	
	
	

