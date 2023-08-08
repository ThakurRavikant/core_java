package com.xworkz.Interface.runner;

import com.xworkz.interfaces.things.Address;
import com.xworkz.interfaces.things.BmtcOwnerName;
import com.xworkz.interfaces.things.BmtcPassanger;
import com.xworkz.interfaces.things.BusNumber;
import com.xworkz.interfaces.things.BusRout;
import com.xworkz.interfaces.things.BusStopName;
import com.xworkz.interfaces.things.ConductorName;
import com.xworkz.interfaces.things.DaliyLoss;
import com.xworkz.interfaces.things.DriverName;
import com.xworkz.interfaces.things.LogIn;
import com.xworkz.interfaces.things.LogOut;
import com.xworkz.interfaces.things.Register;

public class BmtcRunner {
	public static void main(String[] args) {
		BmtcPassanger rg = new Register();
		BusNumber rg1 = new Register();
		BmtcOwnerName rg2 = new Register();

		BusNumber rg3 =  new LogIn();
		BusRout rg4 = new LogIn();
		BusStopName rg5 = new LogIn();

		ConductorName lg1 = new LogOut();
		DaliyLoss lg2 = new LogOut();
		DriverName lg3 = new LogOut();




	}
}
