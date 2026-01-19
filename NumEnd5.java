//Count the no's ending with 5
class NumEnd5
{
	public static void main(String args[])
	{
		int arr[]={5,12,4,21,8,2,3,55,9,11};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%10==5)
			count++;
		}
		System.out.println("The no's are ending with:" +count);
	}
}