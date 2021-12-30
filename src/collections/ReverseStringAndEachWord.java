package collections;

public class ReverseStringAndEachWord {

	public static void main(String[] args) {

		String str = "Welcome to tyss";
		String[] arr = str.split(" ");
		String rev = "";

		for(int i=arr.length-1; i>=0; i--)
		{
			String s = arr[i];

			for(int j =s.length()-1; j>=0; j--)
			{
				rev = rev + s.charAt(j);
			}
			rev = rev + " ";
		}
			
			System.out.print(rev); // ssyt ot emoclew
	
		
	}
}



























/*
String rev = "";
for(int i = str.length()-1; i>=0; i--)
{
	rev = rev + str.charAt(i);
}
System.out.println(rev); 
*/