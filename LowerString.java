//Return a string of remove space in the array
class SpaceRem
{
	public static void main(String args[])
	{
		char arr[]={'N','o','2','6',' ','S','o','u','n','d'};
		String s="";
		for(int i=0;i<arr.length;i++)
		{
			if(!Character.isWhitespace(arr[i]))
				s=s+arr[i];
		}
		System.out.print(s);
	}
}