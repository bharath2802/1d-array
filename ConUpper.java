//take a string and convert each string to uppercase and print
class ConUpper
{
	public static void main(String args[])
	{
		String arr[]={"this","one","doing","hello","am","i","hi","rock","talk","toy"};
		for(int i=0;i<arr.length;i++)
		{
			String s=arr[i].toUpperCase();
			System.out.println(s);
		}
	}
}