class Sunnynumber
{
	public static void main(String[] args)
	{
		int num=46;
		boolean flag=false;
		int sum=num+1;
		for(int i=1;sum>=i;i++)
		{
         if(i*i==sum)
         {
         	flag=true;
         	break;
         }
		}
		if(flag)
		{
			System.out.println("it is sunny number");
		}
		else 
		{
			System.out.println("it is not sunny number");
		}
	}
}