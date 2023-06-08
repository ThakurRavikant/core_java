class Hairs{
static String color;
static int number;
static double thickness;
static double width;
static float area;
public static void display1(){
	System.out.println("Hairs color is:"+color);
	System.out.println("Number of Hairs is:"+number);
	System.out.println("Hairs thickness is:"+thickness);
	System.out.println("Hairs width is:"+width);
	System.out.println("Hairs area is:"+area);
}
public static void setValue(String fcolor,int fnumber,double fthickness,double fwidth,float farea){
	System.out.println("The set value of Hairs");
	color=fcolor;
	number=fnumber;
	thickness=fthickness;
	width=fwidth;
	area=farea;
}
public static void display(){
	System.out.println("Hairs color is:"+color);
	System.out.println("Number of Hairs is:"+number);
	System.out.println("Hairs thickness is:"+thickness);
	System.out.println("Hairs width is:"+width);
	System.out.println("Hairs area is:"+area);
}

}