//change the case of a character in an array and return  as a string
class ChangeCase
{
	public static void main(String args[])
	{
		char arr[]={'N','o','2','6',' ','S','o','u','n','d'};
		String s="";
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isUpperCase(arr[i]))
			s+=Character.toLowerCase(arr[i]);
			else
			s+=Character.toUpperCase(arr[i]);
		}
		System.out.print(s);
	}
}