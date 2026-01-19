//print positive  numbers,divisible by 5 and ending with 7 numbers in an array
class PosArray
{
	public static void main(String args[])
	{
		int arr[]={12,4,8,2,5,21,3,7,9,11};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
				System.out.println("Positive numbers are:" +arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%5==0)
				System.out.println("Divisible by 5 is:" +arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%10==7)
			System.out.println("No's ending with 7 is:" +arr[i]);
		}
	}
}