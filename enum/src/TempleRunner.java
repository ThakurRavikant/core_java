
public class TempleRunner {
	public static void main(String[] args) {
		Temple temple = new Temple();
		temple.display();
		
		Temple temple1 = new Temple("8:00AM","8:00PM",TempleLocation.MP,"Kedarnath",TempleWay.BNG_TO_UTTARAKHAND);
		temple1.display();
		
		Temple temple2 = new Temple("6:00AM","8:00PM");
		temple2.display();
	}

}
