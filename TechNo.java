class TechNo                                             //creating a class
{
	public static void main(String[] args)                             //main method
	{ 
		int num=2085;                                   //declaring and initializing num variable
		int count=0;                                    //declaring and initializng count variable
		int res=num;                                    //declaring and initializing res variable
		while (num>0)
		{
			count++;                               //increasing the count by 1
			num/=10;                                 //deleting the last digit
		}
		if (count%2==0)
		{
			num=res;                                     //reinitializing the num variable
			int div=count/2;                          //dividing the count by 2
			int den=1;                                 //declaring and initializing den variable
			for (int i=1;i<=div;i++)
			{
				den=den*10;                                     
			}
			int firsthalf=num%den;                                //declaring and initializing firsthalf variable                
			int secondhalf=num/den;                             //declaring and initializing secondhalf variable
			int sum=firsthalf+secondhalf;                        //declaring and initializing sum variable
			int mul=sum*sum;                                            
			if (mul==res)
			{
				System.out.println(res+ " It is Tech No.");
			}
			else
				System.out.println(res+ " It is Not Tech No.");
		}
	}
}
