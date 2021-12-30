package collections;

import java.util.LinkedHashSet;

public class PrintUniqueCharacters {
	public static void main(String[] args) {
		
		String str = "nayana";
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(int i = 0; i<str.length(); i++)
		{
			set.add(str.charAt(i));
		}
		
		System.out.println(set);
		
		for(Character ch : set)
		{
			int count = 0;

			for(int i = 0; i<str.length(); i++)
			{
				if(ch==str.charAt(i))
				{
					count++;
				}
			}
			
			if(count==1) 
			{
			System.out.print(ch);
			}
		}
	}

}
