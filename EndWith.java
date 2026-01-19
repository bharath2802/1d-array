//take a string array and print all string end with"ing"
class EndWith
{
	public static void main(String args[])
	{
		String arr[]={"this","one","doing","hello","am","i","hi","rock","talk","toy"};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].endsWith("ing"))
				System.out.println(arr[i]);
		}
	}
}