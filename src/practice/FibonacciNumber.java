package practice;

public class FibonacciNumber {

	public static void main(String[] args) 
	{
		int n1 = 0;
		int n2 = 1;
		
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i =0; i<3; i++)
		{
			int sum = n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}
	}
}
