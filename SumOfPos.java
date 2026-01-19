//sum of positive no's in an array
class SumOfPos
{
	public static void main(String args[])
	{
		int arr[]={5,12,4,21,8,2,3,7,9,11};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
				sum=sum+arr[i];
		}
		System.out.println("the total sum of positive numbers are:" +sum);
	}
}