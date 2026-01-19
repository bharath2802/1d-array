//product of 2 digit numbers
class ProdTwoDigit
{
	public static void main(String args[])
	{
		int arr[]={5,12,4,21,8,2,3,7,9,11};
		double prod=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>9  && arr[i]<99)
			prod=prod*arr[i];
		}
	System.out.println(" the product of two digit no's are:" +prod);
	}
}