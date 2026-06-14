void main()
{
	int n= 500;
	
	
	for(int no=1; no<=n; no++)
	{    int temp = no; 
	     int sum = 0;
		for(;temp !=0; temp = temp/10 )
	     {
		   
		 int rem = temp%10 ;
	     sum = sum + rem*rem*rem;
        }
        if (sum == no)
         {
         	printf("%d ", no);
		 }

	}
	
	
}