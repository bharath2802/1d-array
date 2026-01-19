//merge two array of different length into another array one after the other
class TwoDiffArray
{
	public static void main(String args[])
	{
		int arr1[]={81,82,83};
		int arr2[]={91,92,93,94};
		int arr3[]=new int[arr1.length+arr2.length];
		int k=0;
		for(int i=0;i<arr1.length;i++)
		{
			arr3[k++]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr3[k++]=arr2[i];
		}
		for(int i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}
	}
}