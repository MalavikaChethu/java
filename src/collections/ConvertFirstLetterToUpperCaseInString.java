package collections;

public class ConvertFirstLetterToUpperCaseInString {

	public static void main(String[] args) {
		
	    String str = "welcome to tyss";
	    String[] arr = str.split(" ");
	    
	    for(int i=0; i<arr.length; i++)
	    {
	    	String s1 = "" +arr[i].charAt(0);
	    	System.out.print(s1.toUpperCase());
	    	
		    for(int j=1; j<arr[i].length(); j++)
	    	{
	    		System.out.print(arr[i].charAt(j));
	    	}
	    	System.out.print(" ");
	    }
	 }	
}











/* another way
 String word = arr[i];
  for(int i =0; i<word.length();i++)
  {
  	if(j==0)
  	{
  		// String ch = "" + (char)(word.charAt(j)-32);
  		String ch = "" +word.charAt(j);
  		syso(ch.toUpperCase());
  		}
  		else{
  		syso(word.charAt(j);
  		}
  		}
  		syso(" ");
  		}
 */












/* another way
//Split sentence into words
String[] arr=str.split(" ");
String newString ="";

for(String w: arr)
{
    String first = w.substring(0,1);      //First Letter
    String rest = w.substring(1);         //Rest of the letters

    newString+=first.toUpperCase()+ rest+ " ";  
}  

System.out.println(newString); */