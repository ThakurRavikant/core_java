class Bags{
static String name;
static int noOfBags;
static String color;
static String brand;
static float size;
public static void display1(){
	System.out.println("The bags name is:"+name);
	System.out.println("Number of bags is:"+noOfBags);
	System.out.println("The bags color is:"+color);
	System.out.println("The bags brand is:"+brand);
	System.out.println("The bags size is:"+size);
}

public static void setValue(String vname,int vnoOfBags,String vcolor,String vbrand,float vsize) {
	System.out.println("The value of bages:");
	name=vname;
	noOfBags=vnoOfBags;
	color=vcolor;
	brand=vbrand;
	size=vsize;
}
public static void display(){
	System.out.println("The bags name is:"+name);
	System.out.println("Number of bags is:"+noOfBags);
	System.out.println("The bags color is:"+color);
	System.out.println("The bags brand is:"+brand);
	System.out.println("The bags size is:"+size);
	
}

}