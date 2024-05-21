package api.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


import com.github.javafaker.Faker;

import api.endpoints.UserEndPoints;
import api.payload.User;
import io.restassured.response.Response;


//this function generate data and pass it to pojo class
public class UserTest {
	//this class  to create data
	Faker faker;
	//this object from the user pojo class
	User userPayLoad;

	@BeforeClass
	public void SetUpData()
	{
		faker = new Faker();
		userPayLoad = new User();
		//hena faker will generate fake id and pass it payload bt getid methode
		userPayLoad.setId(faker.idNumber().hashCode());
		userPayLoad.setUsername(faker.name().username());
		userPayLoad.setFirstname(faker.name().firstName());
		userPayLoad.setLastname(faker.name().lastName());
		userPayLoad.setEamil(faker.internet().safeEmailAddress());
		userPayLoad.setPassword(faker.internet().password(5,10));
		userPayLoad.setPhone(faker.phoneNumber().cellPhone());
	
		
	}
	@Test(priority=1)
	public void TestPostUser()
	{
		//there i got the response and log all function is to show me all the response
		Response response = UserEndPoints.createUser(userPayLoad);
		response.then().log().all();
	assertEquals(response.getStatusCode(),200);
		
		
	}
	@Test(priority=2)
	public void testgetuserbyname()
	{
		 Response response = UserEndPoints.readUser(this.userPayLoad.getUsername());
		 response.then().log().all();
		 assertEquals(response.getStatusCode(),200);
	}
	@Test(priority=3)
	public void testupdateuser()
	{
		//update data using payload
		userPayLoad.setFirstname(faker.name().firstName());
		userPayLoad.setLastname(faker.name().lastName());
		userPayLoad.setEamil(faker.internet().safeEmailAddress());
		
		Response response = UserEndPoints.updateUser(this.userPayLoad.getUsername(),userPayLoad);
		response.then().log().body();
		 assertEquals(response.getStatusCode(),200);
		 //check data after upadte
		 Response responseAfterUpdate = UserEndPoints.createUser(userPayLoad);
		assertEquals(responseAfterUpdate.getStatusCode(),200);
		 
	}
	@Test(priority=4)
	public void testdeleteuser()
	{
		Response response = UserEndPoints.deleteUser(this.userPayLoad.getUsername());
		assertEquals(response.getStatusCode(),200);
	}

}
