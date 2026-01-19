//merge 2 arrays of equal size into anothe array such that new array has alternate elements of 2 array
class TwoArray
{
	public static void main(String args[])
	{
		int arr1[]={81,82,83};
		int arr2[]={91,92,93};
		int arr3[]=new int[arr1.length*2];
		int k=0;
		for(int i=0;i<arr1.length;i++)
		{
			arr3[k++]=arr1[i];
			arr3[k++]=arr2[i];
		}
		for(int i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}
	}
}