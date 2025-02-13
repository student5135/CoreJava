class lessthan
{
	public static void main(String[] args)
	{
		int num=10;
		int a=0;
		int b=1;
		int c=0;
		while(a<num)
		{
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;

		}
	}
}