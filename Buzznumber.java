class Buzznumber
{
	public static boolean buzz(int num)
	{
		boolean flag=false;
		int rem=num%10;
		if((num%7==0)||(rem==7))
		{
          flag=true;
		}
		return flag;
	


	}
	public static void main(String[] args)
	{
		boolean check=buzz(17);
		if(check)
		{
			System.out.println("It Is Buzz Number");
		}
		else 
		{
          System.out.println("It Is  Not Buzz Number");
		}
	}
}