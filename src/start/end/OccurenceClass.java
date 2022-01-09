package start.end;

import java.util.HashMap;

public class OccurenceClass {

	public static void main(String[] args) {
		String str = "iliveinpuneandiloveit";
		HashMap<Character,Integer> newmap= new HashMap<>();
		for (int i =0;i<str.length();i++)
		{
			if(newmap.containsKey(str.charAt(i)))
			{
			    int local = newmap.get(str.charAt(i));
				newmap.put(str.charAt(i),++local);
				
			}
			else
			{
				newmap.put(str.charAt(i),1);
			}
		}
		System.out.println("===The occurrence of characters in string is===");
		System.out.println(newmap);

	}

}
