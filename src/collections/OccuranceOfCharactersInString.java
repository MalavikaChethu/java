package collections;

import java.util.LinkedHashSet;

public class OccuranceOfCharactersInString {

	public static void main(String[] args) {
		
		String str = "nayana";
		
		//step 1 : 
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i = 0; i<str.length(); i++)
		{
			set.add(str.charAt(i));
		}
		System.out.println(set);
		for(Character ch : set) //step 2
		{
			int count = 0;

			for(int i = 0; i<str.length(); i++)
			{
				if(ch==str.charAt(i))
				{
					count++; //step 3
				}
			}			
			System.out.println(ch + " " + count); // step 4
		}
	}
}









































/*
 package practice;
 
import java.util.HashMap;

public class OccuranceOfACharacterInAString {

	public static void main(String[] args) {
		
		String str = "religion";
		
		HashMap<Character, Integer> hMap = new HashMap<>();
		
		for(int i = str.length() - 1; i>=0; i--)
		{
			if (hMap.containsKey(str.charAt(i)))
			{
				int count = hMap.get(str.charAt(i));
				hMap.put(str.charAt(i), ++count);
			}
			else
			{
				hMap.put(str.charAt(i), 1);
			}
		}
	
		System.out.println(hMap);
	}

}
*/
