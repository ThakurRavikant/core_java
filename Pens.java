class Pens{
public static void main(String args[]){
int numberOfPens[]={1, 2, 3, 4, 5, 6, 7, 8, 9};
for(int i=0; i<numberOfPens.length; i++){
System.out.println("Number of Pens is:"+numberOfPens[i]);
}
for(int i=0; i<6; i++){
System.out.println("Number of Pens less then 6 is:"+numberOfPens[i]);
}
for(int i=0; i<numberOfPens.length; i++){
if(numberOfPens[i]==5){
	System.out.println("Number of 5 found is:"+numberOfPens[i]);
}else{
	System.out.println("Number is not found :");
}
}
}
}