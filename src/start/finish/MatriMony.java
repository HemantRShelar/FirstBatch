package start.finish;

import javax.management.RuntimeErrorException;

public class MatriMony {

	public static void main(String[] args) {
	 int providedage1=18;
	 int providedage2=60;
	 check1(providedage1,providedage2);
	}
	public static void check1(int providedage1,int providedage2)
	{
	int age=19;
	if (age>providedage1&& age<providedage2) {
		System.out.println("You are eligible");
	} else {
		throw new RuntimeException("you are not eligible");
	}
System.out.println("Welcome to the match");
}
}