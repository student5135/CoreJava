class BinarytoDecimal
{
	public static void main(String[] args)
	{
		int num=1010;
		int bin=0;
		int i=1;
		while(num>0)
		{
			int rem=num%10;
			bin=rem*i+bin;
			num=num/10;
			i=i*2;

		}
		System.out.println(bin);

	}
}