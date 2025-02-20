class  Sum_Of_Each_Digit
{
	public static int Sum(int num)
	{  int sum=0;
		while(num>0)
		{
          int rem=num%10;
          sum=sum+rem;
          num/=10;
        
		}
	
  return sum;
	}
	public static void main(String[] args)
	{
		int Digit=Sum(1234);
		System.out.println(Digit);
	}
}