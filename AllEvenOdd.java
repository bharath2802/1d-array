//print all even numbers followed by odd numbers in an array
class AllEvenOdd
{
	public static void main(String args[])
	{
		int arr[]={5,12,4,21,8,2,3,7,9,11};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				System.out.println("Even no's:" +arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
				System.out.println("Odd no's:" +arr[i]);
		}
	}
}