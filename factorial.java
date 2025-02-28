class factorial
{
	public static void main(String[] args)
	{
		int num=345;
		int count=0;
		while(num>0)
		{
			 int res=1;
			int rem=num%10;
			for(int i=rem;i>=1;i--)
			{

				res=res*i;
			
		}
		  num=num/10;
			System.out.println(res);
		}
	}
}