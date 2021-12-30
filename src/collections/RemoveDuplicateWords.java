package collections;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords
{
	public static void main(String[] args) 
	{
		String str = "welcome to tyss welcome to bangalore";
		String[] arr = str.split(" ");
		
		//step 1
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i = 0; i<arr.length; i++)
		{
			set.add(arr[i]);
		}
		
		// step 2
		for(String word : set)
		{
				System.out.println(word);
		}
	}
}