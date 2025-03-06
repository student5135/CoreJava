class Neonnumber
{
	public static void main(String[] args)
	{
		int num=121;
		int square=num*num;
		int sum=0;
		while(square>0)
		{
			int rem=square%10;
			sum=sum+rem;
			square=square/10;
		}
		if(sum==num)
		{
		System.out.println(num+" is neon number");
	    }
	    else
	    {
	     System.out.println(num+" is not neon number");	
	    }
	    

	}
}