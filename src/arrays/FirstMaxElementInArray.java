package arrays;

public class FirstMaxElementInArray 
{
	public static void main(String[] args) 
	{
					int arr[] = {20,30,10,50,40};
				
				for(int i=0; i<arr.length; i++)
				{
					for(int j=i+1; j<arr.length; j++)
					{
						if(arr[i]<arr[j])
						{
							int temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
				}
				System.out.println("Sorted array : ");
				
				for(int i=0; i<arr.length; i++)
				{
					System.out.println(arr[i]);
				}
				
		System.out.println("First Maximum Element : " + arr[0]);
		}
}
