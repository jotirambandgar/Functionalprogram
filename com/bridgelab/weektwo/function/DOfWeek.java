package com.bridgelab.weektwo.function;
import com.bridgelab.utility.Utility;
import java.util.Scanner;
class Dafnd 
{
	public static String dayFind(int d, int m, int y) 
	{
		int dcod = Utility.findDcode(d, m, y);
		String day[] = {"sunday" , "monday" , "tuesday" , "wednesday" , "thursday" , "friday" , "saturday"};
		return day[dcod];
	}
	
}
public class DOfWeek {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter date as 1st date,month,year " );
		int d;
		int m;
		int y;
		d = scan.nextInt();
		m = scan.nextInt();
		y = scan.nextInt();
System.out.println(d+"/"+m+"/"+y+" = "+ Dafnd.dayFind(d,m,y));
	}

}
