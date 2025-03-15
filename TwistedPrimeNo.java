class TwistedPrimeNo 
{
	public static void main(String[] args) 
	{
		int num=13;
		int count1=0;
		int count2=0;
		int rev=0;
		int res=num;

		for (int i=1;i<=num;i++)
		{
			if (num%i==0)
			{
				count1++;
			}
		}
		while (num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		num=res;
		for (int i=1;i<=rev;i++)
		{
			if (rev%i==0)
			{
				count2++;
			}
		}
		if (count1==2 && count2==2)
		{
			System.out.println(" It Is Twisted PrimeNo.");
		}
		else
			System.out.println(" It Is Not a Twisted PrimeNo.");
	}
}
