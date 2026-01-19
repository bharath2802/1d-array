//split an array into 2 arrays with even no's in one and odd no's into another array
class SplitArray1
{
	public static void main(String args[])
	{
	int arr[]={81,82,83,91,92,93};
	int ec=0,oc=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
			ec++;
		else
			oc++;
		}
	int arr1[]=new int[ec],j=0;
	int arr2[]=new int[oc],k=0;
	for(int i=0;i<arr.length;i++)
	
		if(arr[i]%2==0)
			arr1[j++]=arr[i];
		else
			arr2[k++]=arr[i];
	System.out.println("Even numbers:");
	for(int i=0;i<arr1.length;i++)
		System.out.println(arr1[i]);
	System.out.println("Odd numbers");
	for(int i=0;i<arr2.length;i++)
		System.out.println(arr2[i]);
	}
}

		
	