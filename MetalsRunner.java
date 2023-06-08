class MetalsRunner{
	public static void main(String args[]){
		int count =0;
		for(int i=0; i<Metals.materialsPercentage.length; i++)
		{
			if(Metals.materialsPercentage[i]==4){
		  count= count+1;
		System.out.println("Number of value present in arrays is:"+Metals.materialsPercentage[i]);
		}
		System.out.println("number of 4 value is:"+count);
		}
		for(int i=0; i<Metals.materialsComposition.length; i++)
			
		{
			if(Metals.materialsComposition[i]=="Diamond"){
				System.out.println("Composition of Materials is:"+Metals.materialsComposition[i]);
				break;
			}else{
				System.out.println("Composition of Materials is not found");
			}
			System.out.println("number of MS present is:"+count);
		}
	}
}