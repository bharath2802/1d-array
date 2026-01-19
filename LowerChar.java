//print lowercase character in an array
class LowerChar
{
	public static void main(String args[])
	{
		char arr[]={'N','o','2','6',' ','S','o','u','n','d'};
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isLowerCase(arr[i]))
				System.out.println(arr[i]);
		}
	}
}