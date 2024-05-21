package api.endpoints;
//THIS FILL WILL ONLY CONTAIN URL 
//https://petstore.swagger.io---->base url
//create user(post):https://petstore.swagger.io/v2/user---->base url+endpoint
//get user (Get): https://petstore.swagger.io/v2/user/{username}

public class Routes {
	//i will maintain the url here
	//i made it public so i can acsses everywhere in the project
	//i made it static so i can use it from the class name
	 public static String baseUrl="/https://petstore.swagger.io/v2";
	 
	 //userModel
	 public static String postUrl = baseUrl+"/user";
	 public static String getUrl = baseUrl+"/user/{username}";
	 public static String updateUrl = baseUrl+"/user/{username}";
     public static String deleteUrl = baseUrl+"/user/{username}";
      //pet model
             
     public static String postUrlPet = baseUrl+"/pet";
	 public static String getUrlPet = baseUrl+"/pet/{petId}";
	 public static String getUrlPetStatus = baseUrl+"/pet/findByStatus";
     public static String postUrlPetId = baseUrl+"/pet/{petId}";
	 public static String postUrlPetImage = baseUrl+"/pet/{petId}/uploadImage"; 
	 public static String updateUrlPet = baseUrl+"/pet";
     public static String deleteUrlPet = baseUrl+"/pet/{petId}";
     
     
     //store model
     public static String getUrlStore = baseUrl+"/store/inventory";
   	 public static String getUrlStoreOrder = baseUrl+"/store/order/{orderId}";
   	 public static String postUrlStore = baseUrl+"/store/order/{orderId}";
     public static String deleteUrlStore = baseUrl+"/store/order/{orderId}";
     



	 
	

}
