class Motors{
static String models;
static byte types;
static short capacity;
static int weights;
static double reparingCost;
static float cost;
static long durabletimes;
static char coloRs;
public static void main (String arg[]) {
	Motors.types = 15;
	Motors.capacity = 358;
	Motors.weights   = 185002002;
	Motors.reparingCost = 225000000.50;
	Motors.cost = 8000000000.25f;
	Motors.durabletimes =21200000000l;
	Motors.coloRs ='R';
	System.out.println("Motors before assigning value :"+Motors.models);
	System.out.println("Motors before assigning value :"+Motors.models);
	System.out.println("Motors before assigning value :"+Motors.models);
	System.out.println("Motors before assigning value :"+Motors.models);
	System.out.println("Motors before assigning value :"+Motors.models);
	System.out.println("Motors before assigning value :"+Motors.models);
	System.out.println("Motors before assigning value :"+Motors.models);
	System.out.println("Number of types is:"+types);
	System.out.println("Number of capacity is:"+capacity);
	System.out.println("Motors weights is:"+weights);
	System.out.println("reparingCost is:"+reparingCost);
	System.out.println("durabletimes of motors in sec is:"+durabletimes);
	System.out.println("cost of motors:"+cost);
	System.out.println("coloRs:"+coloRs);
	
}
}