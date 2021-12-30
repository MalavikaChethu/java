package collections;

public class SwappingFirstAndLastWordsInString {

	public static void main(String[] args) {

		String str = " welcome to tyss company ";
		String[] arr = str.split(" ");
		String temp = arr[0];
		
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp;
		
		for(int i =0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
			
	}

}
