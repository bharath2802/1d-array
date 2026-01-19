//Sum of two digit numbers in an array
class SumOfTwoDigits
{
	public static void main(String args[])
	{
		int arr[]={5,12,4,21,8,2,3,7,9,11};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>9 && arr[i]<99)
				sum=sum+arr[i];
		}
		System.out.println("Sum of two digits numbers in array is:" +sum);
	}
}
	