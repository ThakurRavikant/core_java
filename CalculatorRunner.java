class CalculatorRunner{
	public static void main(String args[]){
		int sum= Calculator.add(30,40,150,254);
		System.out.println("sum of number is:"+sum);
		float sub= Calculator.add(80f,100f,524f,121f);
		System.out.println("Substraction of number is:"+sub);
		double mult= Calculator.add(87,100.5,52.50,121);
		System.out.println("Multiplication of number is:"+mult);
		long div= Calculator.add(220l,1312l,8012l,1212l);
		System.out.println("Division of number is:"+div);
	}
}