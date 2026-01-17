//WAP to print all character in an array with its ASCII value
class AllChar
{
	public static void main(String args[])
	{
		char arr[]={'N','o','2','6',' ','S','o','u','n','d'};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+1+" "+arr[i]+" "+ (int)arr[i]);
		}
	}
}