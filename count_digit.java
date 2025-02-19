class count_digit
{
	public static void main(String[] args)
	{
		int count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		System.out.println(count);
	}
	
	
}
