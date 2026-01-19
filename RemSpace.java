//Remove all spaces in an array
class RemSpace
{
	public static void main(String args[])
	{
		char arr[]={'N','o','2','6',' ','S','o','u','n','d'};
		for(int i=0;i<arr.length;i++)
		{
			if(!Character.isWhitespace(arr[i]))
			//if(arr[i]!=' ')
				System.out.print(arr[i]);
		}
	}
}