package practice;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int fact=1;
		int num = 30;
		for(int i=1; i<=num; i++)
		{
			fact = fact*i;
		}
		
		System.out.println("Factorial of " + num + " is : " + fact);
		
	}

}
