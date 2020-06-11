package com.cognixia.jump.fullstack;

import java.util.Scanner;


public class ReadFromConsole {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
	
		boolean isValid = false;
		int in=0;
		while(!isValid) {
			System.out.print("Enter a number: ");
			in = sc.nextInt();
			if(in<50)isValid=true;
		}
		
		int sum=0;
		for(int i=in;i<100;i+=in) {
			System.out.println(sum);
			sum+=i;
		}
		System.out.println("Sum is "+sum);
		sc.close();
	}
}
