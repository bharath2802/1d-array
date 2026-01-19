//take an array of number and find its square root and cube root in a separate array
class SqrtCbrtArray
{
	public static void main(String args[])
	{
		int arr[]={9,12,8,14,16};
		double s[]=new double[arr.length];
		double c[]=new double[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			s[i]=Math.sqrt(arr[i]);
			c[i]=Math.cbrt(arr[i]);
			System.out.println("Number:"+arr[i]);
			System.out.println("Sqrt is:"+s[i]);
			System.out.println("cbrt is:"+c[i]);
			System.out.println("--------------");
		}
	}
}
	