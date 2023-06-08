class Palace{
static String name;
static String location;
static String states;
static float area;
static byte noOfRooms;
public static void display1(){
	System.out.println("The name of Palaces is:"+name);
	System.out.println("The location of Palaces is:"+location);
	System.out.println("The name of states of Palaces is:"+states);
	System.out.println("The area of Palaces is:"+area);
	System.out.println("The number of Rooms of Palaces is:"+noOfRooms);
}
public static void setValue(String fname,String flocation,String fstates,float farea,byte fnoOfRooms){
	name=fname;
	location= flocation;
	states=fstates;
	area=farea;
	noOfRooms=fnoOfRooms;
}
public static void display(){
	System.out.println("The name of Palaces is:"+name);
	System.out.println("The location of Palaces is:"+location);
	System.out.println("The name of states of Palaces is:"+states);
	System.out.println("The area of Palaces is:"+area);
	System.out.println("The number of Rooms of Palaces is:"+noOfRooms);
}
}