package com.xworkz.instanceVariable.thing;

public class Facebook {
	private String firstName;
	private String lastName;
	private String gender;
	private String dateOfBirth;
	private long phoneNumber;
	private String emailId;
	private String password;
	
public Facebook() {
	System.out.println("Default constructor");
}

public Facebook(String firstName,String lastName,String gender, String dateOfBirth,long phoneNumber,String emailId,String password) {
	this.firstName=firstName;
	this.lastName=lastName;
	this.gender=gender;
	this.dateOfBirth=dateOfBirth;
	this.phoneNumber=phoneNumber;
	this.emailId=emailId;
	this.password=password;
	
}
public void register(String firstName) {
	this.firstName=firstName;

	System.out.println("Name of user:"+firstName);
}
public void register(String firstName,String lastName) {
	
	this.firstName=firstName;
	this.lastName=lastName;
	System.out.println("Name of user:"+this.firstName+" "+"User last name:"+this.firstName);

}
public void register(String firstName,String lastName, String gender) {
	this.firstName=firstName;
	this.lastName=lastName;
	this.gender=gender;
	System.out.println("Name of user:"+this.firstName+" "+"User last name:"+this.firstName+" "+"User gender:"+this.gender);

}
public void register(String firstName,String lastName, String gender,String dateOfBirth) {
	this.firstName=firstName;
	this.lastName=lastName;
	this.gender=gender;
	this.dateOfBirth=dateOfBirth;
	System.out.println("Name of user:"+this.firstName+" "+"User last name:"+this.firstName+" "+"User gender:"
+this.gender+" "+"User Date of Birth:"+this.dateOfBirth);

}
public void register(String firstName,String lastName, String gender,String dateOfBirth,long phoneNumber) {
	this.firstName=firstName;
	this.lastName=lastName;
	this.gender=gender;
	this.dateOfBirth=dateOfBirth;
	this.phoneNumber=phoneNumber;
	System.out.println("Name of user:"+this.firstName+" "+"User last name:"+this.firstName+" "+"User gender:"
+this.gender+" "+"User Date of Birth:"+this.dateOfBirth+" "+"User Phone Number:"+this.phoneNumber);

}
public void register(String firstName,String lastName, String gender,String dateOfBirth,long phoneNumber,String emailId) {
	this.firstName=firstName;
	this.lastName=lastName;
	this.gender=gender;
	this.dateOfBirth=dateOfBirth;
	this.phoneNumber=phoneNumber;
	this.emailId=emailId;
	System.out.println("Name of user:"+this.firstName+" "+"User last name:"+this.firstName+" "+"User gender:"
+this.gender+" "+"User Date of Birth:"+this.dateOfBirth+" "+"User Phone Number:"+this.phoneNumber+" "+"User Eamil id:"+this.emailId);


}
public void register(String firstName,String lastName, String gender,String dateOfBirth,long phoneNumber,String emailId,String password) {
	this.firstName=firstName;
	this.lastName=lastName;
	this.gender=gender;
	this.dateOfBirth=dateOfBirth;
	this.phoneNumber=phoneNumber;
	this.emailId=emailId;
	this.password=password;
	
	System.out.println("Name of user:"+this.firstName+" "+"User last name:"+this.firstName+" "+"User gender:"
+this.gender+" "+"User Date of Birth:"+this.dateOfBirth+" "+"User Phone Number:"+this.phoneNumber+" "
			+"User Eamil id:"+this.emailId+" "+"User password:"+this.password);

}
String userName=firstName+lastName;
public String logIn(String userName,String password) {
	if(userName==null) {
		System.out.println("Print null value");
		return null;
	}else if(password==null){
		System.out.println("Null value");
		return null;
	}else {
		return userName;
	
	}
	
}
}






