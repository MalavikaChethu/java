package collections;

public class StringIntoTriangleForm {

	public static void main(String[] args) {
		
		String str = " Welcome ";
		String temp = "";
		
		for(int i =0; i<str.length(); i++)
		{
			temp = temp + str.charAt(i);
			System.out.println(temp);

		}

	}
}
