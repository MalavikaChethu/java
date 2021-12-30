package arrays;

import java.util.LinkedHashSet;

public class PrintDuplicateNumbers 
{
	public static void main(String[] args) 
	{
		int arr[] = {26,50,59,50,87,79,26};
		
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		for(int i = 0; i<arr.length; i++)
		{
			set.add(arr[i]);
		}
		
		for(Integer n : set)
		{
			int count = 0;

			for(int i = 0; i<arr.length; i++)
			{
				if(n== arr[i])
				{
					count++;
				}
			}
			
			if(count>1) 
			{
			System.out.println(n + " " + count);
			}
		}

		
	}
}
