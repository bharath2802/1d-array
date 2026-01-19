//return a string to a uppercase character in the array
class UpperString
{
	public static void main(String args[])
	{
		
		char arr[]={'N','o','2','6',' ','S','o','u','n','d'};
		String s="";
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isUpperCase(arr[i]))
			s=s+arr[i];
			
		}
		System.out.println(s);
	}
}