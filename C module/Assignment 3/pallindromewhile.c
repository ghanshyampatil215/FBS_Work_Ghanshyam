void main()
{
	int no = 121;
	int  rem;
	int rev=0;
	while(no!=0)
	{
		rem=no%10;
		rev=rev*10+rem;
		no= no/10;
	}printf("%d", rev);
}