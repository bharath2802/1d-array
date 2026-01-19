//take name and marks of students and print name and marks of all students who jave scored greater than 90
class Sort
{
	public static void main(String args[])
	{
		String name[]={"Sam","maua","joe","ronit","nihir"};
		int marks[]={91,82,85,92,94};
		int flag=0;
		for(int i=0;i<name.length;i++)
		{
			if(marks[i]>90)
			{
				System.out.println(name[i]+"   "+marks[i]);
				flag=1;
			}
			if(flag==0)
			System.out.println("not found");
		}
	}
}
