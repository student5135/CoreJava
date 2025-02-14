class count
{
	public static void Count(int num)
	{
		int count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		Count(1234);
	}
}