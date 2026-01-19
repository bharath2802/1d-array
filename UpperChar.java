//print only uppercase character in an array
class UpperChar
{
	public static void main(String args[])
	{
		char arr[]={'N','o','2','6',' ','S','o','u','n','d'};
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isUpperCase(arr[i]))
				System.out.println(arr[i]);
		}
	}
}