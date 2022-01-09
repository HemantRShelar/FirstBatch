package start.finish;

public class StringClass {

	public static void main(String[] args) {
		System.out.println("main");
		StringClass ref= new StringClass();
		ref.method1();
	
	
	}
	public void method1()
	{
		System.out.println("method1");
		method2();
	}
	public void method2()
	{
		System.out.println("method2");
		try {
			System.out.println(100/0);
			try {
				System.out.println(10/0);
				
			} catch (Exception e) {
				System.out.println("exception1");
			}
			
		} catch (Exception e) {
		
			System.out.println("exception2");
		}
		finally
		{
			System.out.println("Print");
		}
		method3();
	}
	public void method3()
	{
		System.out.println("method3");
		
	}
	
	

}
