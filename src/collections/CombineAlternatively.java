package collections;

public class CombineAlternatively {
	
	public static void main(String[] args) {
		
		String str = "abc" + "xyz";
		
		for(int i =0; i<str.length()/2; i++)
		{
			String s = "" + str.charAt(i)+str.charAt(str.length()/2+i);
			System.out.print(s);
		}

	}

}
