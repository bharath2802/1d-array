//take an array of numbers and find its square and cube in separate aray
class SqCbArray
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5};
		double s[]=new double[arr.length];
		double c[]=new double[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			s[i]=Math.pow(arr[i],2);
			c[i]=Math.pow(arr[i],3);
		System.out.println(s[i]+" "+c[i]);
		}
	}
}