class XylemPholem
{
	public static void main(String[] args)
	{
		int num=7092;
		int count=0;
		int outdig=0;
		int indig=0;
		while(num>0)
		{
			count++;
			int dig=num%10;
			if(count==1||dig==num)
			{
				outdig=outdig+dig;
			}
			else 
			{
				indig=indig+dig;
			}
			num=num/10;
		}
		if(outdig==indig)
		{
			System.out.println(" It is xylem Number");
		}
		else 
		{
		  System.out.println(" It is Pholem Number");	
		}
	}
}