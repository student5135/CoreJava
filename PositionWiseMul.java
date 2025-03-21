class PositionWiseMul                //creating a class
{
	public static void main(String[] args)                     //main method
	{
		int num=345;                     //declaring and initializing num variable 
		int count=0;                     //declaring and initializing count variable
		int res=num;                    //declaring and initializing res variable
        
		while (num>0)
		{
			count++;                          //increasing the count by 1
			num/=10;                      //deleting the last digit
		}
		num=res;                     //re-initilizing num vaariable
	
		while (num>0)
		{
			
			int rem=num%10;                   //getting the last digit
			int mul=1;                      //declaring and initializing mul variable
		
		for (int i=1;i<=count;i++)
		{
			mul=mul*rem;                             //multiplying mul and rem
		}
		  System.out.println(mul);
		  num/=10;                               //deleting the last digit
		  count--;                                 //decreasing the count by 1
		  
		}
		

	}
}
