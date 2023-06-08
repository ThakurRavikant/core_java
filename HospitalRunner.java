class HospitalRunner{
	public static void main(String args[]){
	System.out.println("length of array is:"+Hospital.recordOfPatient.length);
	for(int i=0; i<Hospital.recordOfPatient.length;i++)
	{
		System.out.println("Array value is:"+Hospital.recordOfPatient[i]);
		
	}
	for(int i=0; i<Hospital.numberOfHospital.length; i++)
	{
	System.out.println("Number of patient is:"+Hospital.numberOfHospital[i]);
	}
	for(int i=0; i<Hospital.numberOfFloors.length; i++)
	{
	System.out.println("Number of patient is:"+Hospital.numberOfFloors[i]);
	}
	
	

}
}