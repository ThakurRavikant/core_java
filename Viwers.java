class Viwers{
public static void main(String args[]){
System.out.println("length of an array is:"+args.length);
for(int i=0; i<args.length; i++)
{
	System.out.println("Argumment elements is:"+args[i]);
	for (int j=i+1; j<args.length; i++)
	{
		if(args[i]<args[j]){
			temp =args[i];
			args[j]=args[i];
			args[j]=temp;
		}
	}
	
}
System.out.println("length of an array is:"+args[i]);
for(int i=0; i<args.length; i++)
{
	System.out.println("Argumment elements is:"+args[i]);
}
}
}