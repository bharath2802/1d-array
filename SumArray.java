//Find the sum of numbers in the array
class SumArray
{
	public static void main(String args[])
	{
		int arr[]={5,12,4,21,8,2,3,7,9,11};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.print("The sum of array is:" +sum);
	}
}