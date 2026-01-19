//take a string array and print all string which start with"T"
class StartWithT
{
	public static void main(String args[])
	{
		String arr[]={"this","one","doing","hello","am","i","hi","rock","talk","toy"};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].startsWith("t"))
				System.out.println(arr[i]);
		}
	}
}