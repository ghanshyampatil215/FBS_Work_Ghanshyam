void main()
{
	int i =1;
	int n = 100;
	for(int no = i; no<=n; no++)
	{
	     int flag=1;
	     
	     for(int j =2; j<no; j++)
	     {
	     	if(no % 2==0)
	     	{
	     		flag=0;
	     		break;
			 }
		 }
		 if(flag ==1&& no>1)
		 {
		 	printf("%d ", no);
		 }
	     
	}
	
	
}