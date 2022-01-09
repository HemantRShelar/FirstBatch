package start.com;

public class PracticeClass {
	public static int a=30;
	public int b=50;
	

	public static void main(String[] args) {
		
		PracticeClass.method();
		PracticeClass.method1();
		System.out.println(PracticeClass.a);
		PracticeClass abc= new PracticeClass();
		abc.method2();
		System.out.println(abc.b);
		
	}
	public static void method()
	{
		System.out.println("Hello");
	}
    public static void method1()
    {
    	System.out.println("Hello method");
    }
    
    public void method2()
    {
    	System.out.println("Hello method2");
    }
}
