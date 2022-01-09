package start.com;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("=============");
		ClassB ref= new ClassB();
		ref.sleep();
		System.out.println(ref.x);
		ref.Walk();
		
		//System.out.println("=============");
		//ClassB refb= new ClassB();
		//refb.sleep();
		//System.out.println(refb.x);
		
		//System.out.println("=====runtime polymorphism=======");
		//ClassB refab= new ClassA();
//		refab.sleep();
//		System.out.println(refab.x);
//		System.out.println("==============");
		

	}

}
