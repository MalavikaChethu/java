package arrays;

public class SegerateZeroToLast 
{
	public static void main(String[] args) 
	{
		int a[] = {1,0,2,0,3,0,0,4};
		int m = 0;
		int n = a.length-1;
		int b[] = new int[a.length];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==0)
			{
				b[n] = a[i];
				n--;
			}
			else
			{
				b[m] = a[i];
				m++;
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(b[i] + " ");
		}
	}
	

}
