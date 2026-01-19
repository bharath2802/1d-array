//product of positive numbers in an array
class ProdPos
{
	public static void main(String args[])
	{
		int arr[]={5,12,4,21,8,2,3,7,9,11};
		int prod=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
				prod=prod*arr[i];
		}
		System.out.println("the product of positive no's are:" +prod);
	}
}