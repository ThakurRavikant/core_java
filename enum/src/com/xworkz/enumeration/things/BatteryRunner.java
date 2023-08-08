package com.xworkz.enumeration.things;


public class BatteryRunner {
	public static void main(String[] args) {
		Battery battery = new Battery();
		battery.display();
		
		Battery battery1 = new Battery("Torex",5000,"06-02-2023",BatteryTypes.AC);
		battery1.display();
		
		Battery battery2 = new Battery();
		battery2.setTypes(BatteryTypes.DC_AC);
		battery2.display();
	}

}
