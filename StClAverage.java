//take name and marks in 3 subjects of 5 students and calculate each student average and class average
class StClAverage
{
	public static void main(String args[])
	{
		String Name[]={"SAM","MAYA","JOE","RONIT","NIHIT"};
		int m1[]={70,80,80,75,70};
		int m2[]={80,78,68,72,80};
		int m3[]={80,90,60,96,60};
		double avg[]=new double[m1.length];
		double sum=0,cavg=0;
		for(int i=0;i<Name.length;i++)
		{
			avg[i]=(m1[i]+m2[i]+m3[i])/3;
			sum+=avg[i];
		System.out.println(Name[i]+" "+avg[i]);
		}
		cavg=sum/m1.length;
		System.out.println("CLASS AVERAGE:"+cavg);
	}
}