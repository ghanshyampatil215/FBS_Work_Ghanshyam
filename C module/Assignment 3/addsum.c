void main()
{
	int no = 12345;
	int first, last, sum;

	
	last = no%10;
	
	while(no>=10)
	{
		no = no/10;
	} 
	 first = no;
	sum = first + last;
  printf("%d", sum);
}
