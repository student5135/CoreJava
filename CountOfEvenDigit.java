class  CountOfEvenDigit
{
	public static void main(String[] args)
	{
		int num=1234;
		int count=0;
		 while(num>0)
		 {  int rem=num%10; 
		    if(rem%2==0)
		    {
		    	count++;
		    	
		    }
		    num/=10;

		 }
		 System.out.println(count);
	}
}