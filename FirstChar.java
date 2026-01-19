//take a string array and print the first character of each string
class FirstChar
{
	public static void main(String args[])
	{
		String arr[]={"this","one","doing","hello","am","i","hi","rock","talk","toy"};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].charAt(0));
		}
	}
}