package tests;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutPatchAndDeleteExamples {

	@Test
	public void testPut() {
		
		
		JSONObject request= new JSONObject();
		request.put("name", "Tina");
		request.put("job", "Tester");
		
		System.out.println(request.toJSONString());
		
		given().
		header("content-Type", "application/json").
		body(request.toJSONString()).
		when().
		put("https://reqres.in/api/users/2").
		then().
		statusCode(200).
		log().all();
		
	}
	@Test
	public void testPatch() {
		
		
		JSONObject request= new JSONObject();
		request.put("name", "Tina");
		request.put("job", "Tester");
		
		System.out.println(request.toJSONString());
		
		given().
		header("content-Type", "application/json").
		body(request.toJSONString()).
		when().
		patch("https://reqres.in/api/users/2").
		then().
		statusCode(200).
		log().all();
		
	}
	@Test
	public void testDelete() {
				
		
	
		when().
		delete("https://reqres.in/api/users/2").
		then().
		statusCode(204).
		log().all();
		
	}
}
