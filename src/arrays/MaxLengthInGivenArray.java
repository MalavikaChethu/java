package arrays;

public class MaxLengthInGivenArray 
{
	public static void main(String[] args) 
	{
		String str[] = {"abc", "hi", "mango", "j", "tyss", "apple"};
		String max = str[0];
		
		for(int i=1; i<str.length; i++)
		{
			if(max.length()<str[i].length())
			{
				max = str[i];
			}
		}
		for(int i=0; i<str.length; i++)
		{
			if(max.length()==str[i].length())
			{
				System.out.println(str[i]); 
			}
			
		}
	}
}



/*
package arrays;

public class MinLengthInGivenArray 
{
	public static void main(String[] args) 
	{
		String str[] = {"abc", "hi", "mango", "j", "tyss"};
		String max = str[0];
		
		for(int i=1; i<str.length; i++)
		{
			if(max.length()<str[i].length())
			{
				max = str[i];
			}
		}
		System.out.println(max);
	}
}
 */