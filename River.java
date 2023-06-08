class River{
static String name;
static String place;
static String typesOfRiver;
static int length;
static String states;
public static void display1(){
	System.out.println("The name of river is:"+name);
	System.out.println("The place  name of river is:"+place);
	System.out.println("The types of river is:"+typesOfRiver);
	System.out.println("The length of river is:"+length);
	System.out.println("The state name of river is:"+states);
}
public static void setValue(String fname,String fplace,String ftypesOfRiver,int flength,String fstates){
	System.out.println("The set value of river after assinging");
	name=fname;
	place=fplace;
	typesOfRiver=ftypesOfRiver;
	length=flength;
	states=fstates;
}
public static void display(){
	System.out.println("The name of river is:"+name);
	System.out.println("The place  name of river is:"+place);
	System.out.println("The types of river is:"+typesOfRiver);
	System.out.println("The length of river is:"+length);
	System.out.println("The state name of river is:"+states);
}
}