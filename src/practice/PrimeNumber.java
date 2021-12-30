package practice;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int num = 23;
		int i = 2;
		
		boolean flag = false;
		
		while(i <= num/2)
		{
			if(num%i==0)
			{
				flag = true;
				break;
			}
		
				++i;
		}		
			if(!flag)
			{
				System.out.println("It is a prime number ");
			}
			else
			{
				System.out.println("It is not a prime number ");
			}
		}
	}