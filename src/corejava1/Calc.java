package corejava1;

import java.util.Scanner;

public class Calc
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("press 1 for addition\n2 for substraction\n3 formultiplication\n4 for division\n5 for modulus");
		int c=sc.nextInt();
		switch(c)
		{
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.println(a*b);
				break;	
			case 4:
				if(b==0)
					System.out.println("/0 exception");
				else
					System.out.println(a/b);
				break;
			case 5:
				System.out.println(a%b);
				break;
			default:
				System.out.println("wrong choice");
		}
	}
}
