void main()
{
	int no = 7;
	int i=2;
	int flag = 0;
	while(i<no)
	{
		if(no%i == 0)
		{
		
		flag = 1;
		break;
	}i++;
	}if(flag==0 && no>1 )
	{
		printf("prime nu");
	}else printf("no prime nu");
}