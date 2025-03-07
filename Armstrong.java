class Armstrong
{
	public static void main(String[] args)
	{
		
			int num=157;
			int sum=0;
			int res=num;
			int count=0;
			while(num>0)
			{
				count++;
				num=num/10;
			}
			num=res;
			while(num>0)
			{
				int rem=num%10;
				int mul=1;
				for(int i=1;i<=count;i++)
				{
					mul=mul*rem;
				}
				sum=sum+mul;
				num=num/10;
			}

			if(sum==res)
			{
				System.out.println(res+"is Armstrongnumber");
			}
			else 
			{
				System.out.println(res+"is not Armstrongnumber");
			}

		}
	}
