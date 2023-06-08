class Forest{
	static String name;
	static String area;
	static byte size;
	static int trees;
	static long noOfAnimials;
	public static void display1(){
		System.out.println("The name of Forest is:"+name);
		System.out.println("The area of Forest is:"+area);
		System.out.println("The size of Forest is:"+size);
		System.out.println("The number of tress in Forest is:"+trees);
		System.out.println("The number of Animals in Forest is:"+noOfAnimials);
	}
	public static void observation(String fname,String farea,byte fsize,int ftrees,long fnoOfAnimials){
		System.out.println("The observation of forest");
		name=fname;
		area=farea;
		size=fsize;
		trees=ftrees;
		noOfAnimials=fnoOfAnimials;
	}
	public static void display(){
		System.out.println("The name of Forest is:"+name);
		System.out.println("The area of Forest is:"+area);
		System.out.println("The size of Forest is:"+size);
		System.out.println("The number of tress in Forest is:"+trees);
		System.out.println("The number of Animals in Forest is:"+noOfAnimials);
	}
}