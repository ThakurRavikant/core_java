class States{
	public static void main(String args[]){
		String nameOfStates[]={"Delhi","Punjab","Karnataka","UP","Bihar","Himanchal","Hydrabad","Maharastra","GOA","Assam"};
		for(int i=0; i<nameOfStates.length; i++){
			System.out.println("Elements of arrys is :"+nameOfStates[i]);
		}
		for(int i=0; i<8; i++)
		{
			System.out.println("States of India:"+nameOfStates[i]);
		}
		for(int i=0; i<nameOfStates.length;i++)
		{
			if(nameOfStates[i]== "Karnataka"){
				System.out.println("Karnataka states is found:"+nameOfStates[i]);
				break;
			}else{
				System.out.println("Karnataka states is not found:");
			}		
		}
	}
}