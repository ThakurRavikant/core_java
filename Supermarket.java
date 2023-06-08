class Supermarket{
public static void iteam(String nameOfIteam[],int price[]){
	//case:1
	for(int i=0; i<nameOfIteam.length; i++)
	{
System.out.println("The name of Iteams in an Array is:"+nameOfIteam[i]);
	}
	for(int i=0; i<price.length; i++)
	{
System.out.println("The Price of Iteams is :"+price[i]);
	}
}
//case:2
public static void iteam(String nameOfIteam[],int price[],boolean available){
	for(int i=0; i<nameOfIteam.length; i++)
	{
System.out.println("The name of Iteams in an Array is:"+nameOfIteam[i]);
	}
	for(int i=0; i<price.length; i++)
	{
System.out.println("The Price of Iteams is :"+price[i]);
	}
	System.out.println(available+" "+"iteam");
}
//case:3
public static void iteam(String nameOfIteam[],String nameOfCompany[]){
	for(int i=0; i<nameOfIteam.length; i++)
	{
System.out.println("The name of Iteams in an Array is:"+nameOfIteam[i]);
	}
	for(int i=0; i<nameOfCompany.length; i++)
	{
System.out.println("The Price of Iteams is :"+nameOfCompany[i]);
	}
}
}


