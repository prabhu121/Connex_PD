package interfacetest;

import java.util.Scanner;

public class Tiger
{
	int count=0;
	public int  add(int a ,int b)
	{
		int result=a+b;
		return result;
	}
	public int noOfOccurance(String s)
	{
		for( int i=0; i<s.length(); i++ )
		{
		    if( s.charAt(i) == 'i' ) 
		    {
		    	count++;
		    } 
		}
		return count;
	}
	public static void main(String[] args)
	{
		/*Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a = scanner.nextInt();
		System.out.println("Enter the 2nd number");
		int b = scanner.nextInt();
		Tiger t= new Tiger();
		System.out.println(t.add(a, b));*/
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the string to count number of i");
		String name = scanner.nextLine();
		Tiger t= new Tiger();
		System.out.println("no of i occurance : "+t.noOfOccurance(name));
	}

}
