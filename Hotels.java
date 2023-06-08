class Hotels{
public static void main(String args[]){
	int numberOfRooms[]= new int[10];
	String nameOfStaff[]= new String[10];
	numberOfRooms[0]=1;
	numberOfRooms[1]=2;
	numberOfRooms[2]=3;
	numberOfRooms[3]=4;
	numberOfRooms[4]=5;
	numberOfRooms[5]=6;
	numberOfRooms[6]=7;
	numberOfRooms[7]=8;
	numberOfRooms[8]=9;
	numberOfRooms[9]=10;
	nameOfStaff[0]="A";
	nameOfStaff[1]="B";
	nameOfStaff[2]="C";
	nameOfStaff[3]="D";
	nameOfStaff[4]="E";
	nameOfStaff[5]="F";
	nameOfStaff[6]="G";
	nameOfStaff[7]="H";
	nameOfStaff[8]="I";
	nameOfStaff[9]="J";
	System.out.println("Length of an arrays is:"+numberOfRooms.length);
	System.out.println("Length of an arrays is:"+nameOfStaff.length);
for(int i=0; i<numberOfRooms.length; i++){
	System.out.println("Elements of an arrays is:"+numberOfRooms[i]);
}
for(int i=0; i<nameOfStaff.length; i++){
	System.out.println("Elements of an arrays is:"+nameOfStaff[i]);
}
	
	

}
}