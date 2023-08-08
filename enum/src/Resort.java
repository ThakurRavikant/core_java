
public class Resort {
 String name;
 String duration;
 enumLocation location;
 String joinDate="10-06-2023";
 enumTypeOfFood typesOfFood;
 
 public Resort() {
	System.out.println("No argument constructor of Resort");
}
 public Resort(String name, String duration) {
	 super();
		this.name=name;
		this.duration=duration;
	}
 
  public Resort(String name, String duration, String joinDate ,enumLocation location,enumTypeOfFood typesOfFood) {
	this("Reliance","2_days");
	this.name=name;
	this.duration=duration;
	this.location=location;
	this.joinDate=joinDate;
	this.typesOfFood=typesOfFood;
	
}
  void setLocation(enumLocation location) {
	  this.location=location;
	 
	  //super("Hari","Chikkamanglore",10/06/2023,"Briyani");
	  
  }
  void settypesOfFood(enumTypeOfFood typesOfFood) {
	  this.typesOfFood=typesOfFood;
  }
  void display() {
	  System.out.println(this.name);
	  System.out.println(this.duration);
	  System.out.println(this.location);
	  System.out.println(this.joinDate);
	  System.out.println(this.typesOfFood);
  }
 
}
