class ReverseString{
	public static void main(String args[]){
		int vcount=0, ccount=0, digit=0, space=0, dcount=0;
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine(); // to get input from user
		s=s.toLowerCase(); // to conver the given string to lowercase */
		String name="java programming";
		for(int i=name.length()-1; i>=0;i--){
			System.out.print(name.charAt(i));
		}
		char ch[]=name.toCharArray();
		System.out.println();
		for(int i=0; i<name.length(); i++){
			char ch=name.charAt(i); // return character in ith index
			if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u'){
				vcount++;
			}else if(ch>='a' && ch<='z'){
				ccount++;
			}else if(ch>='0' && ch<='9'){
				digit++;
			}else if(ch==' '){
				space++;
			}
				
		}
		for(int i=0; i<name.length(); i++){
			char ch=name.charAt(i);
			for(int j=i+1; j<name.length(); j++){
				if(ch[i]==ch[j]){
					System.out.println("Duplicate Character in String are:"+ch[j]);
					dcount++;
				}
			}
	
		}
		System.out.println("vowels count:"+vcount);
		System.out.println("consonant count:"+ccount);
		System.out.println("digit count:"+digit);
		System.out.println("space count:"+space);
		System.out.println("Duplicate Character count:"+dcount);
     }
		  
}