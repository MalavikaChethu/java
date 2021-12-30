package collections;

public class ReverseEachWord {

	public static void main(String[] args) {

		String str = "Welcome to tyss";
		String[] arr = str.split(" ");
		
		for(int i=0; i<arr.length; i++)
		{
			String s = arr[i];
			String rev = "";

			for(int j =s.length()-1; j>=0; j--)
			{
				rev = rev + s.charAt(j);
			}
			System.out.print(rev + " "); // emocleW ot ssyt 
	}
		
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