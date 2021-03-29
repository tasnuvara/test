package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;


//@Test
public class GetAndPostExamples {

	
	public void testGet() {
		
	given().
		get("https://reqres.in/api/users?page=2").
	then().
		statusCode(200).
		body("data[4].first_name", equalTo("George"));
		}
	
	@Test
	public void testPost() {
		
		Map<String, Object> map= new HashMap<String, Object>();
		//map.put("name", "Tina");
		//map.put("job", "Tester");
		//System.out.println(map);
		//System.out.println(map.hashCode());
		
		JSONObject request= new JSONObject();
		request.put("name", "Tina");
		request.put("job", "Tester");
		
		System.out.println(request.toJSONString());
		
		given().
		header("content-Type", "application/json").
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(201).
		log().all();
		
	}
}
