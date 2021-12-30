package collections;

public class ReverseWordInString {

	public static void main(String[] args) {
	    
	    String str = "welcome to tyss";
	    String rev = "";
	    
        String[] arr = str.split(" ");
        

        //Reverse each word's position
        for(int i =arr.length-1; i>=0; i--)
        {
        	rev = rev+arr[i] + " ";
        }
        
	    System.out.println(rev); // tyss to welcome
	  }
}
























/* another method of reverse words in string
 * for (int i = 0; i < words.length; i++) { 
    if (i == words.length - 1) 
        rev = words[i] + rev; 
    else
        rev = " " + words[i] + rev; 
} */


