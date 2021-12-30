package collections;

public class SumOfDigitsInString {

    public static void main(String[] args) {

        String str = "dhj34dfhf9fs";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

        	if (str.charAt(i)>='0' && str.charAt(i)<='9')
        	{

        		int n = str.charAt(i)-48;
                 sum = sum + n;

         	}
        }
     
        System.out.println(sum);

    }
}
















//    char[] c = str1.toCharArray();
//    int sum = 0;
//            if (Character.isDigit(c[i])) {
//
//                System.out.print("Digits in the String : " + c[i]);
//                System.out.println();
//
//                int a = Integer.parseInt(String.valueOf(c[i]));
//
//                sum = sum + a;
//
//            }

//        }
