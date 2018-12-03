package com.bridgelab.weektwo.function;
import java.util.Arrays;
import java.util.Scanner;
import com.bridgelab.utility.*;
class Operation
{
	public static void checkCollinearUsingArea( int x1, int y1, int x2, int y2, int x3,int y3 )
	{
		int ans = (1/2)*(((x1-x2)*(y2-y3))-((x2-x3)*(y1-y2)));
		if(ans == 0)
		{
			
		       System.out.println("Yes");
		}
		        else
		            System.out.println("No"); 
}
	public static void checkCollinearUsingSlope( int x1, int y1, int x2, int y2, int x3,int y3 )
	{
		int ab = (y2-y1)/(x2 - x1);
		int bc =  (y3 - y2)/(x3 - x2);
		int ac = (y3 - y1)/(x3 - x1);    
		if(ab == ac && ac == bc)
		{
			
		       System.out.println("Yes");
		}
		        else
		            System.out.println("No"); 
		
	}
    public static void SqrRoot(double n)
     {
	
     }
}
public class MathFunction {

	public static void main(String[] args) 
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.to find harmonic of number.\n2.find sin cosin angle.\n3. prime check. \n4. factorial of number. \n5.calculates the present day value of an amount .\n6.Given three points, check whether they lie on a straight (collinear) or not.\n7.calculate binary form of digit.\n8. find square Root of double number ");
		System.out.println("9. claculate Square root of double number");
		System.out.println("10. find maximum and minimum number in array");
		System.out.println("11. find maximum and minimum String in array");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1 :

			    System.out.println("enter number");
                int N=sc.nextInt();
			    System.out.println("th Harmonic Value = "+Utility.harmonicOpt(N));
			    break;
		 case 2:
			    double degree;
				System.out.println("Enter number in degree:");
		        degree = sc.nextDouble();
                Utility.trigOpt(degree);
				break;

		case 3 :
			    int n = Integer.parseInt(args[0]);
			    System.out.println(n+" is prime :"+Utility.isPrime(n));
			    break;
		case 4 :
			    int num = Integer.parseInt(args[0]);
			    System.out.println("factorial of "+num+" :"+Utility.factiral(num));
			    break;
		case 5:
			     double r,t,c;
			    System.out.println("enter intrest rate");
			    r = sc.nextDouble();
			    System.out.println("enter time period");
			    t=sc.nextDouble();
			    System.out.println("enter amount receive after "+t+" year:");
		        c=sc.nextDouble();
		        double p_value = (c/Math.pow((1+r),t));
		        System.out.println("present day value of an amount :"+p_value);
		        break;
		case 6:
			   int A[] = new int[2];
			   int B[] = new int[2];
			   int C[] = new int[2];
			   System.out.println("Enter coordinates of A:");
			   for(int i = 0; i < 2; i++ )
			   {
				   if(i==0)
				   {
					   System.out.println("X coordinate:");
				   }
				   else
				   {
					   System.out.println("Y coordinate:");
				   }
				   A[i] = sc.nextInt();
				  
				   
			   }
			   System.out.println("Enter coordinates of B:");
			   for(int i = 0; i < 2; i++ )
			   {
				   if(i==0)
				   {
					   System.out.println("X coordinate:");
				   }
				   else
				   {
					   System.out.println("Y coordinate:");
				   }
				   B[i] = sc.nextInt();
				  
				   
			   }
			   System.out.println("Enter coordinates of C:");
			   for(int i = 0; i < 2; i++ )
			   {
				   if(i==0)
				   {
					   System.out.println("X coordinate:");
				   }
				   else
				   {
					   System.out.println("Y coordinate:");
				   }
				   C[i] = sc.nextInt();
			   }
				  
				 Operation.checkCollinearUsingArea( A[0],A[1], B[0], B[1], C[0], C[1])   ;
				 Operation.checkCollinearUsingSlope( A[0],A[1], B[0], B[1], C[0], C[1])   ;
				 break;
		case 7: 
			   System.out.println("Enter a number:");
			   int k = sc.nextInt();
			   int []bin = Utility.toBinary(k);
			   String s = Arrays.toString(bin).replaceAll("\\[|\\]|,|\\s","");
			   System.out.println(s);
			   break;
		case 9:
			   double Num = Double.parseDouble(args[0]);
			   double T = Num; 
			   double epsilon = 1e-15;
			   System.out.println("Square root of"+Num+"="+Utility.sqtCal(Num, T, epsilon)); 
			   System.out.println("fds");
			   break;
			   
		case 10:
			   int N1[] = new int[9];
			   System.out.println("Enter number in Array:");
			   for(int i =0; i < N1.length;i++)
			   {
				   N1[i] = sc.nextInt();
			   }
			   System.out.println("Maximum value in int Array:"+Utility.maxNumArray(N1));
			   System.out.println("Minimum value in int Array:"+Utility.minNumArray(N1));
		       
		case 11:
			   String N2[] = new String[9];
			
			   System.out.println("Enter number in Array:");
			   for(int i =0; i < N2.length;i++)
			   {
				   N2[i] = sc.next();
			   }
			   System.out.println("Maximum value in String Array:"+Utility.maxStrArray(N2));
			   System.out.println("Minimum value in String Array:"+Utility.miniStrArray(N2));
		}
	}
}


