package collections;

public class ConvertFromLowerToUpper {

	public static void main(String[] args) {

		String str = "stone";
		
		for(int i =0; i<str.length(); i++)
		{
			if(i==0)
			{
				String s = "" + str.charAt(i);
				System.out.print(s.toUpperCase());
				
			//	char ch = (char)(str.charAt(i)-32);
				//System.out.print(ch);
				
			}
			else
			{
				System.out.print(str.charAt(i));
			}
		}
		
	}

}






















/* all characters in string to upper casee
for(int i=0; i<str.length(); i++)
{
	String s = "" + str.charAt(i);
	System.out.print(s.toUpperCase());
} */