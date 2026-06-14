void main()
{
	int n = 500;
     
	
	for (int no=1; no<=n; no++)
   {
	  int temp = no;
      int sum=0;
     
      while (temp!=0)
      {
      	int rem=temp%10;
      	
      	int fact=1;
      	for (int i=1 ; i<=rem; i++)
      	{
      		fact = fact*i;
		 } 
		  sum=sum+fact;
		  temp=temp/10;
		  
		
        }if (sum==no)
		{
        	printf("%d ", no);
    }   
		}
	
}