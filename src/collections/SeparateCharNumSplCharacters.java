package collections;

public class SeparateCharNumSplCharacters {

	public static void main(String[] args) {

        String str = "af!#@dc258";
        String alp = "";
        String num = "";
        String spl = "";
        
        for(int i=0;i<str.length();i++)
        {
        	if( str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z' )
        	{
        		alp = alp+str.charAt(i);
        	}
        	else if (str.charAt(i)>='0' && str.charAt(i)<='9')
        	{
        		num = num+str.charAt(i);
        	}
        	else
        	{
        		spl = spl+str.charAt(i);
        	}
        }     	
        System.out.println("Alphabets : " + alp + " Numbers : " + num + " Special Characters :" + spl );
    }
}