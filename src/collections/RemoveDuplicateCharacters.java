package collections;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {

public static void main(String[] args) {
		
		String str = "nayana";
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(int i = 0; i<str.length(); i++)
		{
			set.add(str.charAt(i));
		}
		
		//System.out.println(set);
	
		for(Character ch : set)
		{
				System.out.print(ch);
		}
	}
}
