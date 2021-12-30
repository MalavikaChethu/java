package collections;

import java.util.LinkedHashSet;

public class PrintDuplicateWords
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
		
		System.out.println(set);
		// step 2
		for(String word : set)
		{
			int count = 0;
			for(int i=0; i<arr.length; i++)
			{
				if(word.equals(arr[i]))
				{
					count++; //step 3
				}
			}
		
			if(count>1) 
			{
				System.out.println(word + " " + count);
			}
		
		}
	}
}