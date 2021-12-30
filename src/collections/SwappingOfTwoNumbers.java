package collections;

import java.util.Scanner;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter values of num1 and num2 : ");
		Scanner s = new Scanner(System.in);
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		System.out.println("Before Swapping Numbers : " +num1+ " " + num2);
		
		num1 = num1 + num2 ;
		num2 = num1 - num2 ;
		num1 = num1 - num2 ;
		
		System.out.println("After Swapping Numbers : " +num1+ " " + num2);
	}
}
