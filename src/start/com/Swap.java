package start.com;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number in a:");
		a=s.nextInt();
		System.out.println("Enter number in b:");
		b=s.nextInt();
		System.out.println("Enter number in c:");
		c=s.nextInt();
		
		c=a;
		a=b;
		b=c;
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
