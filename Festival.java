class Festival{
	static String name;
	static float date;
	static String foods;
	static String cloths;
	static String typeOfFestival;
	public static void display1(){
	System.out.println("The name of Festival is:"+name);
	System.out.println("The date of Festival is:"+date);
	System.out.println("The name of foods Festival is:"+foods);
	System.out.println("The name of cloths wearing at Festival is:"+cloths);
	System.out.println("The types of Festival is:"+typeOfFestival);
}
public static void setValue(String fname,float fdate,String ffoods,String fcloths,String ftypeOfFestival){
	System.out.println("The set value after assingning");
	name=fname;
	date= fdate;
	foods=ffoods;
	cloths=fcloths;
	typeOfFestival=ftypeOfFestival;
}	
public static void display(){
	System.out.println("The name of Festival is:"+name);
	System.out.println("The date of Festival is:"+date);
	System.out.println("The name of foods Festival is:"+foods);
	System.out.println("The name of cloths wearing at Festival is:"+cloths);
	System.out.println("The types of Festival is:"+typeOfFestival);
}
}