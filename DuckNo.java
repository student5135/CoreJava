class DuckNo 
{
	public static void main(String[] args) 
	{
		int num=035;
		int count=0;
		int res=num;
		int rev=0;

		while (num>0)
		{
			int rem=num%10;
			if (rem==0)
			{
				count++;
			}
			num/=10;
		}
		num=res;
		while (num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		int rem1=rev%10;
		if (rem1!=0 && count>=1)
		{
			System.out.println(" It iS Duck No.");
		}
		else
			System.out.println(" It is Not a Duck No.");

	}
}
