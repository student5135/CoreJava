class adddigit{
	public static void main(String[] args)
	{
		int num=1234;
		int add=0;
		while(num>0){
			int digit=num%10;
             add+=digit;
			System.out.println(add);
			digit=digit/10;
		}
	}
}