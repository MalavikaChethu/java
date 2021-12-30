package collections;


public class SumOfGroupedNumbers 
{

	public static void main(String[] args) {
		
		String str = "15ab10$25h15";
		int sum = 0 ;
		int tSum = 0 ;
		
		for(int i=0; i<str.length(); i++)
		{
			if (str.charAt(i)>='0' && str.charAt(i)<='9') 
			{
				int n = str.charAt(i)-48;
				sum = sum*10+n;
			}
			else
			{
				tSum = tSum + sum ;
				sum = 0; // if alphabet is at end till this loop it will work 
			}
		}
		tSum = tSum + sum ; // if there is number at end this to be there
		System.out.println(tSum);
	}
}





























// sum ==> it will store sum of consecutive number
// tSum ==> it will give sum of grouped number