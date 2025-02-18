class Count_even_odd_digit
  {
    public static void main(String[] args)     
    {
      int num=85986;            
      int counteven=0;     
      int countodd=0;         

    while (num>0)                
      {
        int rem=num%10;         
        if (rem%2==0)             
        {
          counteven++;
        }
        else
        {
          countodd++;
        }
        num/=10;
      }
      System.out.println(counteven);
      System.out.println(countodd);
    }
  }
