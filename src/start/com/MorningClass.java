package start.com;

public class MorningClass {
public static int a=30;
public int b=50;
	public static void main(String[] args) 
	{
		int x=40;
		System.out.println(10+x);
		System.out.println("Hello everyone");
		MorningClass.method();
		MorningClass.m2();
		MorningClass abc= new MorningClass();
		abc.method3();
		abc.m4();
		System.out.println(MorningClass.a);
		System.out.println(abc.b);
		System.out.println("============");
		System.out.println(EveningClass.m);
		EveningClass.walk();
		EveningClass ref= new EveningClass();
		ref.sleep();
		System.out.println(ref.n);
	
	}
public static void method() 
{
	System.out.println("Hello method");
		
	}
public static void m2()
{
	System.out.println("Hello m2");
		
	}
public void method3()
{
	System.out.println("Hello method3");
		
	}
public void m4()
{
	System.out.println("Hello m4");
		
	}

}
