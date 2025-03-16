class DecimaltoBinary
{
	public static void main(String[] args)
	{
		int num=10;
		int bin=0;
		int i=1;
		while(num>0)
		{
			int rem=num%2;
			bin=rem*i+bin;
			num=num/2;
			i=i*10;
		}
		System.out.println(bin);

	}
}