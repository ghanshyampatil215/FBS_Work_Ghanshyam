void main()
{
int i=1;
int n=100;
   for(int no= i ; no<=n; no++)
   {
   	 int sum =0;
	
    	for(int j=1; j<no; j++)
	    {
	    	if(no%j == 0)
	  	 {
		  
	  	 sum=sum+j;
	    }
	 }
	   if(sum == no);
	  {
	  	printf("%d ",no);
	  }
}
}
