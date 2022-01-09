package start.end;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CollectionClass {

	public static void main(String[] args) {
	int a=30;
	int b=40;
	int c=50;
	int d=60;
	int e=70;
	System.out.println(a);
	System.out.println("===========");
	
	int[] num= new int[5];
	num[0]= 30;
	num[1]= 40;
	num[2]= 50;
	num[3]= 60;
	num[4]= 70;
	System.out.println(num[3]);
	System.out.println(num.length);
	
	System.out.println("Collection");
	
	List<Integer> numArr= new Vector<>();
	numArr.add(10);
	numArr.add(30);
	numArr.add(100);
	numArr.add(70);
	numArr.add(90);
	numArr.add(60);
	numArr.add(20);
	numArr.add(30);
	
	System.out.println(numArr.get(6));
	System.out.println(numArr.size());
			
			
	
	}

}
