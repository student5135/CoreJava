class Product_of_eachdigit
{
	public static void main(String[] args)
	{
		int num=456;
		int prod=1;
		while(num>0)
		{
			int rem=num%10;
			prod=prod*rem;
			num=num/10;
		}
		System.out.println(prod);

	}
}