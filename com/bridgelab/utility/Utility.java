package com.bridgelab.utility;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Utility {
public static String[] nameReverse(String firstName, String secondName, String thirdName)
{
	String name[] = {firstName,secondName,thirdName};
	int START = 0;
	int END = name.length-1;
	String temp;
	while(START < END)
	{
		temp = name[START];
		name[START] = name[END];
		 name[END]=temp;
		 START++;
		 END--;
	}
	/*for(int i=0; i< name.length;i++)
	{
		System.out.println(name[i]);
	}*/
	return name;
		}
//****************************************************************************************************************

public static void intOpt(int A, int B, int C)
{
	int FIRSTOPERATION = ( (A + B) * C );
	int SECONDOPERATION= ( (A * B) + C );
	int THIRDOPERATION=( (C + A) / B );
	int FORTHOPERATION=( (A % B) + C );
System.out.println(" A + B * C = " + FIRSTOPERATION);
System.out.println(" A * B + C = " + SECONDOPERATION);
System.out.println(" A + B / C = " + THIRDOPERATION);
System.out.println(" A % B + C = " + FORTHOPERATION);
}
//************************************************************************************************************
public static void doubleOpt(double A, double B, double C)
{
	double FIRSTOPERATION = ( (A + B )* C);
	double SECONDOPERATION=((A * B) + C);
	double THIRDOPERATION=((C + A) / B);
	double FORTHOPERATION=((A % B )+ C);
	System.out.println(" A + B * C = " + FIRSTOPERATION);
	System.out.println(" A * B + C = " + SECONDOPERATION);
	System.out.println(" A + B / C = " + THIRDOPERATION);
	System.out.println(" A % B + C = " + FORTHOPERATION);
}
//*******************************************************************************************************************
public static String  leapCheck(int YEAR)
{

	if(YEAR<1582)
	{
	return "pls enter year greater than 1528";
		
	}
	if(YEAR%100==0)
		{
		if( YEAR%400==0)
	{
		return "leap year";
	}
		}
	if (YEAR%100!=0)
			{
		if( YEAR%4==0)
	{
		
		return "is a leap year";
		}
			
			}
	return " is not leap year";
	
			
}


//***************************************************************************************************************
public static boolean dateCheck(int m, int d)
{
int start=0;
int end=0;
int count=0;

if((m==3 & d>=20 && d<=31 )||(m==4 & d>=1 && d<=30 )||(m==5 & d>=1 && d<=31 )||(m==6 & d>=1 && d<=20 ) )
{
	return true;
}

return false;
}
//****************************************************************************************************************
public static double[] rootFinding(double a,double b,double c)
{
	int count=1;
	int i=0;
	double delta;
	double root[]=new double[2];
	double x;
	while(count<=2)
	{
		
		delta = (b*b) - (4*a*c);
		if(count==1) {
			x = (double)(-b + Math.pow(delta,0.5))/(2*a);
		}
		else
		{
			x = (double)(-b - Math.pow(delta,0.5))/(2*a);
		
	}
root[i]=x;
	count++;
	i++;
}
	return root;
}
//****************************************************************************************************************
public static double distance(int y, int x)
{
	int X=x*x;
	int Y=y*y;
	double distance=Math.pow(X+Y,0.5);
	return distance;
}
//***********************************************************************************************************
public static int dCalc(int first, int second,int sum)
{
	System.out.println("throw two dice");
	Random random=new Random();
	 first=random.nextInt(6)+1;
	 second=random.nextInt(6)+1;
	 System.out.println(first);
	 System.out.println(second);
	sum=first+second;
	return sum;
}
//********************************************************************************************************************
//prints five uniform random values between 0 and 1,their average value, and their minimum and maximum value
public static void sOperations(float num[], int i,int j,float average, float sum, float min)
{
	for(i=0;i<num.length;i++)
	{
		num[i]=(float)Math.random()*1+0;// generate random values between 0 and 1
	}
	for(i=0;i<num.length;i++)
	{
		sum=sum+num[i];
	}
	for(i=0;i<num.length;i++)
	{
		System.out.println(num[i]);//printing value
	}
	average=sum/5;
	min=num[0];
	
	for(i=1;i<num.length;i++)
	{

	
	
		if(num[i]<min)
				{
		min=num[i];
	}
	}
	
	float max=num[0];
	for(i=1;i<num.length;i++)
	{

	
	
		if(num[i]>max)
		{			{
		max=num[i];
	}
	}
	}

	System.out.println("Average of five number:" + average);
	System.out.println("minimum value in array:" + min);
	System.out.println("maximum value in array:" + max );

}
//**********************************************************************************************************
public static int findDcode(int d,int m,int y)
{
	int y0 = ((y - (14-m) / 12));

int x = (y0 + y0/4 - y0/100 + y0/400);
int m0 = (m + 12 * ((14 - m) / 12) -2);
int d0 = (((d + x + 31*m0 / 12)%7));
return d0;
}
//************************************************************************************************************
public static float claWindchill(int t, int v, float windchill)
{
	if(t>50 && 3<v && v<120)
	{
		System.out.println(" the formula is not valid if t is larger than 50 in absolute value or if v is larger than 120 or less than 3 ");
		
	}
	else
	{
	windchill=(float)(35.75+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16));
	//System.out.println("the wind chill :"+windchill);
	}
	return windchill;
}
//**************************************************************************************************************
public static int tempConversion(int choice)
{
	Scanner sc = new Scanner(System.in);
int result=0;
	switch(choice)
	{
	case 1:
		System.out.println("Enter temperature in Celsius");
		int temp = sc.nextInt();
		 result = (temp * 9/5) + 32;
		//System.out.println(result+ "°F");
		break;
	case 2:
		System.out.println("Enter temperature in Fahrenheit");
		int temp1 = sc.nextInt();
		 result = (temp1 - 32) * 5/9;
		//System.out.println(result1+ "°C");
		 default:
			 System.out.println("Invalid choice");
}
return result;	
}
//**************************************************************************************************
public static float loanCalc(float P,float Y,float R)
{
	float n = (12 * Y);
	float r = R / (12 * 100);
	
	float t = (float)(P * r);
	float m = (float)(1 - Math.pow((1 + r),(-n)));
	
	float payment = t / m;
	return payment;
}
//**************************************************************************************************************
public static void trigOpt(double degree)
{
	double rad=Math.toRadians(degree);
	int sans=(int)Math.sin(rad);
	int cans=(int)Math.cos(rad);
	System.out.println("sin("+degree+")="+sans);
	System.out.println("cos("+degree+")="+cans);
	
}

//**************************************************************************************************************
public static void coinOpt(double time)
{
	 double tem;
	 double h=0;
     double t=0;
 for(int i=1;i<=time;i++)
 {
   tem=Math.random();
   if(tem<0.5)
   {
       t++;
   }
   else
   {
       h++;
   }
 }
System.out.println("number of head "+h);
System.out.println("number of tails "+t);

double prcH=h/time*100;
double prcT=t/time*100;
 System.out.println("percentage of head "+prcH+"%");
System.out.println("percentage of tails "+prcT+"%");

}
//****************************************************************************************************************
public static float harmonicOpt(int n)
{

	float result=0;
	for(float i=1;i<=n;i++)
	{
		result=result+(1/i);
	}
	return result;
	
}
//*********************************************************************************************************

public static void gameRecord(int stake,int goal,int trials)
{
float win=0;
float loss=0;
int cash=stake;
double tem;
int winbet=0;
int lossbet=0;
float avgbet=0;
for(int i=trials;i>0;i--)
{
 //tem=Math.random();	

while(cash>0 && cash!=goal)
{
	 tem=Math.random();	
	if(tem>0.5)
	{
		win++;
		cash++;
		winbet++;
	}
	else
	{
		loss++;
		cash--;
		lossbet++;
	}
	
}
//System.out.println("number of times he win="+win);
//System.out.println("number of times he loss="+loss);


}
avgbet=(winbet+lossbet)/2;
System.out.println("number of times he win="+win);
System.out.println("number of times he loss="+loss);
System.out.println("average of bets he made="+avgbet);
}
//*****************************************************************************************************************

public static List<Integer> primeFinding(int N)
{
	List<Integer> l=new LinkedList<Integer>();
    int count = 0;
    for(int i=2;i<=N;i++)
    	{
    	count = 0;
    	for(int j=2;j<=i/2;j++)
    	{
    		if(i%j==0)
    		{
    			count=1;
    		}
    	}
    	if(count==0)
    	{
    		l.add(i);
    		
    	}
    	}
    return l;
}
//***********************************************************************************************************************
public static double sqtCal(double c, double t, double epsilon)
{
	//System.out.println(""+(1e-15)); 
			while (Math.abs(t - c/t) > epsilon * t) 
			{ //replacing t with avg of c/t and t
				t = (c/t + t) / 2.0; 
			}
			return t;
}

//*******************************************************************************************************************
public static int factiral(int n)
{
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	
	return fact;
}

//***************************************************************************************************************
public static int[] toBinary(int num)
{
	//int num=26;
	int j=0;
	List<Integer> l=new LinkedList<Integer>();
	Scanner s=new Scanner(System.in);
	while(num!=0)
	{
		j=num%2;
		l.add(j);
		num=num/2;
		
	}
	Collections.reverse(l);
	int a[]=new int[l.size()];
for(int i = 0; i < l.size();i++)
{
	 a[i]=l.get(i);
}
	return a;
}
//********************************************************************************************************************
public static int toDecimal(String s)
{
	//System.out.println(s);
	int binnum = 0;
	int len = s.length() - 1;
	for( int i = 0; i < s.length(); i++ )
	{
		if( s.charAt(len) == '1' )//  compare char from last char
		{
		 binnum= binnum + (int)Math.pow(2, i) ;
			
		}
		len--;
	}
	return binnum;

	}
//************************************************************************************************************
//30/11/2018
//***************************************************************************************************************
public static String strReverse(String s)
{
String reverse = "";
	
	for(int i = s.length()-1; i >= 0; i--)
	{
	reverse = reverse + s.charAt(i);
	}
	return reverse ;
}
//**********************************************************************************************************	
public static void permutationStr(String s2,String s1)
{
	
		
		
		
	 if(s1.length()==0)
		{
			System.out.println("permuted string+"+s2);
			s2="";
		}
		//System.out.println("main string="+s);
		//System.out.println("permuted string+"+s2);
		
			for(int i=0;i<s1.length();i++)
			{
				
				permutationStr(s2+s1.charAt(i),s1.substring(0,i)+s1.substring(i+1,s1.length()));
		
		}
		}
//**********************************************************************************************************************************
	public static double sinX(double x)
	{
		x=(x%(2*Math.PI));//Convert angle x to an angle between ­2 PI and 2 PI using following logic
		double sinx=0;
		int n=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter upto how many term it calculate:");
			int	N=sc.nextInt();

		int count=0;
		while(count!=N)
		{
		
		
		if(count%2==0)
		{
			sinx=sinx+(Math.pow(x,n)/Utility.factiral(n));// if my position at even position then add term else subs term
		}
		else {
		sinx=sinx-(Math.pow(x, n)/Utility.factiral(n));
		}
	
		
		n=n+2;
		count++;}
		return sinx;
	
		
	}
	//***************************************************************************************************************
	public static double cosX(double x)
	{
		double cosx=1;
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter upto how many term it calculate:");
		int	N=sc.nextInt();
		double power=1;
	int count=0;
	while(count!=N)
	{
	
	
	if(count%2==0)
	{
		cosx=cosx+(Math.pow(x,n)/Utility.factiral(n));
	}
	else 
	{
	cosx=cosx-(Math.pow(x, n)/Utility.factiral(n));
	}

	
	n=n+2;
	count++;
	}
	return cosx;
	
		
	}
//***********************************************************************************************************************
	public static Boolean isPrime(int n)
	{
		int count = 0;
		for(int i = 2; i <= n/2 ;i++)
		{
			if(n % i == 0)
			{
				count++;
			}
			
		}
		if(count == 0)
		{
			return true;
		}
		return false;
	}
//************************************************************************************************************************************
	public static int maxNumArray(int num[])
	{
		
		int max=num[0];
		for(int i=1;i<num.length;i++)
		{

		
		
			if(num[i]>max)
			{			
			max=num[i];
		    }
		
	     }
		return max;
    }
//***********************************************************************************************************************
	public static int minNumArray(int num[])
	{
	int min=num[0];
	
	for(int i=1;i<num.length;i++)
	{

	if(num[i]<min)
	{
	min=num[i];
	}
	}
	return min;
	}
//****************************************************************************************************
    public static String maxStrArray(String s[])
    {
    	String max = s[0];
    	for(int i = 1; i < s.length; i++)
    	{
    		String temp = s[i];
    		int tem= s[i].compareTo(max);
    		if(tem > 0)
    		{
    			max = temp;
    		}
   
    	}
    	return max;
    }
//*******************************************************************************************
    public static String miniStrArray(String s[])
    {
    	String min = s[0];
    	for(int i = 1; i < s.length; i++)
    	{
    		String temp = s[i];
    		int tem= s[i].compareTo(min);
    		if(tem < 0)
    		{
    			min = temp;
    		}
   
    	}
    	return min;
    }
}


