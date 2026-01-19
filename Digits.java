//print only digits in an array
class Digits
{
	public static void main(String args[])
	{
		char arr[]={'N','o','2','6',' ','S','o','u','n','d'};
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isDigit(arr[i]))
				System.out.println(arr[i]);
		}
	}
}