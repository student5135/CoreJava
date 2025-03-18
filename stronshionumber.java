 class stronshionumber
 { public static void main(String[] args)
 {
 	int num=1234;
 	int count=0;
 	int res=num;
    while(num>0)
    {
    	count++;
    	num=num/10;
    }
    if(count==4)
    { 
    num=res;
    int mul=num*2;
    int den=1;
    int tensdigit=0;
    int hundreddigit=0;
    System.out.println("mul:"+mul);
    while(mul>0)
    {
    	den=den*10;
    	int rem=mul%10;
    	if(den==100)
    	{
    		System.out.println("tens:" +rem);
    		tensdigit=rem;

    	}
    	if(den==1000)
    	{
    		System.out.println("hundred:" +rem);
    		hundreddigit=rem;
    	}
    	mul=mul/10;
    }
    if(tensdigit==hundreddigit)
    {
    	System.out.println("it is Strontio number");
    }
    else 
    {
       System.out.println("it is  not Strontio number");
    }
}
else
{
	System.out.println("it is  not Strontio number");
}


 }
 }