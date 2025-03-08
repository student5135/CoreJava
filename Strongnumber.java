class Strongnumber
{
	public static void main(String[] args)
	{
		int num=145;
		int sum=0;
		int res=num;
		while(num>0)
		{
			int rem=num%10;
			int fact=1;
			for(int i=rem;i>=1;i--)
			{
                fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(sum==res)
		{
			System.out.println("It is Strong Number");
		}
		else 
		{
             System.out.println("It is  not Strong Number");
		}
	}
}