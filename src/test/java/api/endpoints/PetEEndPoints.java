package api.endpoints;
import static io.restassured.RestAssured.given;

import java.util.List;
import java.util.Map;

import api.payload.Pet;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PetEEndPoints {
	
	public static Response createPet(Pet payload)
	{
		Response response =given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		.when()
		.post(Routes.postUrlPetId);
		return response;
	
	}
	public static Response createPets(List <Pet> payload)
	{
		Response response =given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		.when()
		.post(Routes.postUrlPet);
		return response;
	
	}
	public static Response createPetWithImage(Pet payload)
	{
		Response response =given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		.when()
		.post(Routes.postUrlPetImage);
		return response;
	
	}
	public static Response readpet(String PetId)
	{
		Response response =given()
				//we give it the name of pathparam and the value
		.pathParam("PetId",PetId)
		.when()
		.get(Routes.getUrlPet);
		return response;
	
	}
	public static Response readpetWithStatus(String PetId)
	{
		Response response =given()
				//we give it the name of pathparam and the value
		.pathParam("PetId",PetId)
		.when()
		.get(Routes.getUrlPetStatus);
		return response;
	
	}
	
	public static Response updateUser(Pet payload)
	{
		Response response =given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		.when()
		.put(Routes.updateUrlPet);
		return response;
	
	}
	public static Response deletePet(String PetId)
	{
		Response response =given()
				.header("key","special-key")
			    .pathParam("PetId",PetId)
		.when()
		.get(Routes.deleteUrl);
		return response;
	
	}
	
	
	

}
