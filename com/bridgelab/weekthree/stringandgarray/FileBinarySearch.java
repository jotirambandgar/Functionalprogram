//Binary Search for String Array
package com.bridgelab.weekthree.stringandgarray;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
class Operation
{
	public static void sort(String s[])
	{
		
	/*for(int i=0;i <= s.length; i++)
	{
		for(int j=i+1;j <= s.length; j++)
		{
		if(s[i].compareTo(s[j]) < 0)
		{
			String temp = s[j];
			s[j] = s[i];
			s[i] = temp;
		}
		}
	}*/
		
		Arrays.sort(s);//for sorting array
	
		
	    System.out.println("position of string:"+binarySearch(s));
	//System.out.println(s[0]);
    }
	public static int binarySearch(String s2[])
	{
		System.out.println("Enter search string");
		Scanner sc = new Scanner(System.in);
		String search = sc.next();
		int low = 0;
	    int high = s2.length - 1;
	    int mid = 0;
	
		while (low <= high)
		{
	        mid = (low + high) / 2;

	        if (s2[mid].compareTo(search) < 0) 
	        {
	            low = mid + 1;
	        } 
	        else if (s2[mid].compareTo(search) > 0) 
	        {
	            high = mid - 1;
	        } 
		
		    else 
		     {
	            return mid;
		     }
	  }
		return -1;
	}
}

public class FileBinarySearch {

	public static void main(String[] args) {
	
				try {
	BufferedReader br = new BufferedReader(new FileReader("/home/bridgeit/eclipse-workspace/newtasksheet/src/binary.txt"));
	String s="";
	//LinkedList <Integer> l = new LinkedList <> ();

	while((s = br.readLine()) != null)
	{
		System.out.println(s);
		// s=br.readLine();
		String str[] = s.split(",");
		Operation.sort(str);

		  
	}
	
	}
		catch(Exception e)
		{
			
		}
	}

}
