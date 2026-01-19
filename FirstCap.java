//take a string and make first letter capital and print it
class FirstCap
{
	public static void main(String args[])
	{
		String arr[]={"this","one","doing","hello","am","i","hi","rock","talk","toy"};
		for(int i=0;i<arr.length;i++)
		{
			char f=arr[i].charAt(0);
			f=Character.toUpperCase(f);
			String e=arr[i].substring(1);
			System.out.println(f+e);
		}
	}
}