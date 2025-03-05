class Spynumber
{
	public static void main(String[] args)
	{
		int num=123;
		int mul=1;
		int sum=0;
		int num1=num;

		while(num>0)
		{
			 int rem=num%10;
			sum=sum+rem;
			mul=mul*rem;
			num=num/10;

		}
		if(sum==mul)
		{
			System.out.println(num1+" is spy number");
		}
		else 
		{
			System.out.println(num1 +" is  not spy number");
		}

	}
}