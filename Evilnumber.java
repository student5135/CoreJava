class Evilnumber

{
	public static void main(String[] args)
	{
		int num=16;
		int bin=0;
		int i=1;
		int count=0;
		while(num>0)
		{
			int rem=num%2;
			bin=rem*i+bin;
			num=num/2;
			i=i*10;
		}
	
	while(bin>0)
	{ int rem1=bin%10;
		if(rem1==1)
		{
			count++;
		}
		bin=bin/10;
	}
	if(count%2==0)
	{
		System.out.println("It Is Evil Number");
	}
	else 
	{
		System.out.println("It Is Not Evil Number");
	}
	}
}