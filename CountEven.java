//print the count of even numbers in an array
class CountEven
{
	public static void main(String args[])
	{
		int arr[]={5,12,4,21,8,2,3,7,9,11};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			count++;
		}
		System.out.println("the number of even no's in an array:" +count);
	}
}