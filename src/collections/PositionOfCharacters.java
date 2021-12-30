package collections;

import java.util.LinkedHashSet;

public class PositionOfCharacters {

	public static void main(String[] args) {
		
		String str = "tester";
		
		//step 1 : 
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i = 0; i<str.length(); i++)
		{
			set.add(str.charAt(i));
		}
		for(Character ch : set) //step 2
		{
			for(int i = 0; i<str.length(); i++)
			{
				if(ch==str.charAt(i))
				{
					System.out.println(ch + " " +(i+1));
					break;
				}
			}			
		}
	}
}
