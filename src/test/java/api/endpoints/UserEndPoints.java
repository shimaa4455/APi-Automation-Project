package api.endpoints;
import static io.restassured.RestAssured.given;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
//endpoints.java
//created for perform crud opertions in the user api
//payload is request body
public class UserEndPoints {
	//in this methode we have some pre request like 
	//header and content tyoe and we have the request it self
	
	public static Response createUser(User payload)
	{
		Response response =given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		.when()
		.post(Routes.postUrl);
		return response;
	
	}
	public static Response readUser(String username)
	{
		Response response =given()
				//we give it the name of pathparam and the value
		.pathParam("username",username)
		.when()
		.get(Routes.getUrl);
		return response;
	
	}
	//this function neaded the username it wiil upade and the payload it self
	public static Response updateUser(String username ,User payload)
	{
		Response response =given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.pathParams("username",username)
		.body(payload)
		.when()
		.put(Routes.updateUrl);
		return response;
	
	}
	public static Response deleteUser(String username)
	{
		Response response =given()
		.pathParam("username",username)
		.when()
		.delete(Routes.deleteUrl);
		return response;
	
	}
	
	
	

}
