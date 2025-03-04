class Palidrome
{
	public static void main(String[] args)
	{
		int num=121;
		int reverse=0;
		int palidrome1=num;
		while(num>0)
		{
			int rem=num%10;
			 reverse=reverse*10+rem;
			num=num/10;

		}
		if(reverse==palidrome1)
		{
			System.out.println(palidrome1);

		}
}
}