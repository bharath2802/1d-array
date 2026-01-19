//print only 2 digit numbers from an array
class TwoDigitsArray
{
	public static void main(String args[])
	{
		int arr[]={5,12,4,21,8,2,3,7,9,11};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>9 && arr[i]<99)
				System.out.println("two digit no's:" +arr[i]);
		}
	}
}