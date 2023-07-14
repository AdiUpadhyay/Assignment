package com.day6.java;

public class Day6_ForLoop_Homework {

	public static void main(String[] args) {
		//can you write a program to print first 100 natural numbers using for loop
		
		int i;
		
		System.out.println("print first 100 natural numbers using for loop");
		for (i=0; i<=100;i++)
		{
			System.out.println(i);
		}
		
		
		
		//can you write a program to print first 50 even numbers using for loop
		int j;
		System.out.println("print even numbers till 50");
		for (j=0; j<=50; j++)
		{
			if (j%2 ==0)
			{
				System.out.println(j);
			}
			
		}
		//write a program to print first 50 even numbers using for loop
		int k;
		int l = 0;
		System.out.println("print first 50 even numbers");
		for (k=0; k<=200; k++ )
		{
			if (k%2==0 || l==50)
			{
				l++;
				System.out.println(k);
				if(l==50)
				{
					break;
				}
			}
			
		}
		
		//write a program to print reversely from 100 to 1 using for loop
		int m;
		System.out.println("print reversely from 100 to 1");
		for (m=100; m>=0;m--)
		{
			System.out.println(m);
		}
				//write a program to print reversely from 99 till 3 with 3 separations - 99, 96, 93, 90, ......... 3
		int n;
		System.out.println("program to print reversely from 99 till 3 with 3 separations");
		for (n=99; n>=0;n--)
		{
			if(n%3==0)
			System.out.println(n);
		}
				//write a program to print first 10 multiples of 5 and add the sum of the multiples
		System.out.println("program to print first 10 multiples of 5 and add the sum of the multiples");
		int o= 5;
		int sum =0;
		for (int p=1; p<=10;p++ )
		{
			int q= o * p;
			
			sum = sum+ q;
			System.out.println(q);
			
		}
		System.out.println("sum is " + sum);
				//write a program to print from 100 till 5 reversely - 100,95,90,......5 and then add the sum of all the reverse multiples and give the value
		int r= 5;
		int sum1 =0;
		for (int s=100; s>=0;s-- )
		{
			if(s%r==0)
			{
				System.out.println(s);
				sum1 = sum1+ s;
			}
			
			
		}
		System.out.println("sum is " + sum1);
	}

}
