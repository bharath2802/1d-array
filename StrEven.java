//take a string array and print all string which have even length
class StrEven
{
	public static void main(String args[])
	{
		String arr[]={"this","one","doing","hello","am","i","hi","rock","talk","toy"};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()%2==0)
				System.out.println(arr[i]);
		}
	}
}