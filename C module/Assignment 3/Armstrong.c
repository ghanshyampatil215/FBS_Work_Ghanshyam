void main()
{
	int no = 153;
	int temp = no;
	int rem;
	int sum=0;
	while(no!=0)
	{
		rem=no%10;
		sum=sum+rem*rem*rem;
		no=no/10;
	}
	if (sum == temp)
	{
		printf("it Armstrong nu");
	}else
	{
	  printf("it is not Armstrong number");
    }
}