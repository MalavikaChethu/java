package collections;

public class ReverseStringWithoutLengthFunction {
	
	public static void main(String[] args) {
	
		String str = "RELIGION";
		String rev = "";
		
		char[] ch = str.toCharArray();
		int count = 0;
		
		for(char c:ch)
		{
			count++;
		}
		
		for(int i=count-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		
		System.out.println(rev);
	}
}
