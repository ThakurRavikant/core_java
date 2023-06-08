class SupermarketRunner{
public static void main(String args[]){
String nameOfIteam[]={"Books","Pens","Chips","Drinks","Chocolates"};
int price[] ={60,10,35,50,10};
String nameOfCompany[]={"Big Mart","Special Mart","Wonder Mart","Diamond Mart","Sunrise Mart"};
Supermarket.iteam(nameOfIteam,price);
Supermarket.iteam(nameOfIteam,price,true);
Supermarket.iteam(nameOfIteam,nameOfCompany);
}
}