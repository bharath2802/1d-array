//take a string array and print each string in reverse
class RevString
{
	public static void main(String args[])
	{
		String arr[]={"this","one","doing","hello","am","hi bye","rock","talk","toy"};
		for(int i=0;i<arr.length;i++)
		{
			String s=arr[i];
			String rev="";
		for(int j=0;j<s.length();j++)
		{
			char c=s.charAt(j);
			rev=c+rev;
			}
			System.out.println(rev);
		}
	}
}