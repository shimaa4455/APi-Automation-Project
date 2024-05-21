package api.payload;
//implement  pojo class of user payload
public class User {
	
int	id;
String username;
String firstname;
String lastname;
String eamil;
String password;
String phone;
int userStatus=0;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEamil() {
	return eamil;
}
public void setEamil(String eamil) {
	this.eamil = eamil;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public int getUserStatus() {
	return userStatus;
}
public void setUserStatus(int userStatus) {
	this.userStatus = userStatus;
}


	
}
