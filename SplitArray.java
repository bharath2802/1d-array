//take an array of double values and split it into 2 parts , the whole number and fractional number
class SplitArray
{
	public static void main(String args[])
	{
		double arr[]={4.5,9.65,68.5,14.45,0.16};
		long w[]=new long[arr.length];
		double f[]=new double[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			w[i]=(long)arr[i];
			f[i]=arr[i]-w[i];
		}
		System.out.println("Whole numbers are");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(w[i]);
		}
		System.out.println("Fractional numbers are");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(f[i]);
		}
	}
}