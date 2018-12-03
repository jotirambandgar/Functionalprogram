package com.bridgelab.weektwo.function;

public class Testing {

	public static void main(String[] args) {
		String s = "sadk";
		//int l=s.length()-1;
		int k = 0;
		int n = s.length();
		int perl = 1;
		while((n - k) != 0)
		{
			perl = perl * ( n - k );
			k++;
			
		}
		String permut[] = new String[perl];
		System.out.println(s.substring(0, 1));
		for(int l=0; l < s.length(); l++)
		{
	String permu= "" +s.charAt(l);
		for(int i=0;i<s.length();i++)
		{
		if(l!=i)
		{
			 permu += s.substring(0,i) + s.substring(i+1,s.length());	
		}
		}
		permut[l]=permu;
		}
	
	/*for(int i=0;i<s.length();i++)
	{
		System.out.println(permut[i]);
	}*/

}
}