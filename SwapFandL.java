//take a string array and swap the first letter and last letter character of each string and then print it
class SwapFandL
{
	public static void main(String args[])
	{
		String arr[]={"this","one","doing","hello","am","hi","rock","talk","toy"};
		for(int i=0;i<arr.length;i++)
		{
		char f=arr[i].charAt(0);
		int len=arr[i].length();
		char l=arr[i].charAt(len-1);
		String m=arr[i].substring(1,len-1);
		System.out.println(l+m+f);
		}
	}
}