package com.bridgelab.weektwo.function;
import com.bridgelab.utility.Utility;
import java.util.Scanner; 
class Check
{
public static boolean anagram(String s1,String s2)
{
	int count = 0;
	String ns1=s1.replace(" ", "");
	String ns2=s2.replace(" ", "");
	if(ns1.length() != ns2.length())
	{
		return false ;
	}
	for(int i = 0; i < ns1.length(); i++)
	{
		for(int j = 0; j < ns1.length(); j++)
		{
			if(Character.toLowerCase( ns1.charAt(i)) == Character.toLowerCase(ns2.charAt(j)))//if my char in uppercase Charecter class convert into lower case and compare it
			{
			count++ ;	
			}
		}
	}
	if(count != ns1.length())//check my count is less than string length
	{
		return false;
	}
	return true;
}
public static boolean palindrom(String s3)
{
	String reverse = Utility.strReverse(s3);
	
	
	
	//System.out.println(reverse);
	if(reverse.equals(s3))
	{
		return true;
	}
	return false;
		
}
public static boolean chkArray(String fst[],String scnd[])
{
	int count = 0;
	if(fst.length != scnd.length)
	{
		return false;
	}
	for(int i = 0; i < fst.length; i++)
	{
		for(int j =0 ; j< scnd.length; j++)
		{
			if(fst[i].equalsIgnoreCase(scnd[j]))
					{
				    count ++;
					}
		}
	}
	if(count == fst.length)
	{
		return true;
	}
	return false;
}
}
public class Stringoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int choice;		
Scanner scan = new Scanner(System.in);
System.out.println("1. to check if the given two strings are an Anagram");
System.out.println("2. to check if the given String is palindrome ");
System.out.println("3. permutation of a String using Recursion method");
System.out.println("4. to check if the arrays returned by two string functions above are equal");
choice=scan.nextInt();
 switch(choice)
 {
 
 case 1 :
	      System.out.println("checking string are anagram or not");
	      System.out.println("Enter two strings"); 
          String s1 = scan.next();
          String s2 = scan.next();
          System.out.println("is "+s1+" "+"and"+" "+s2+" anagram:"+Check.anagram(s1,s2));
          break;
 case 2 :
	      System.out.println("checking string are palindrom or not");
          String s3;
          System.out.println("Enter String for palindrom checking:");
          s3 = scan.next();
          System.out.println("is "+s3+" palindrom "+Check.palindrom(s3));
          break;
 case 3:
	      System.out.println("Enter two strings"); 
          String str = scan.next();
          Utility.permutationStr("",str);
          break;
 case 4:
	      System.out.println("String array equal or not");
	      String fst[] = {"aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg"};
	      String scnd[] = {"GGG", "FFF", "EEE", "DDD", "CCC", "BBB", "AAA"};
	      System.out.println("String arrays equal : " + Check.chkArray(fst, scnd));
	      break;

	}

}
}
