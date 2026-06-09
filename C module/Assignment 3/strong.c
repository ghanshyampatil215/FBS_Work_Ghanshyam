void main()
{
	int no = 145;
	int temp = no;
	int rem;
	 int fact = 1;
     int i=1;
	int sum = 0;
	while(no!=0)
	{
     rem= no%10;
     
     fact = 1;
     i = 1;
    
     while(i<=rem)
     {
     	fact = fact *i;
     	i++;
	 }
	 
	 sum = sum+ fact;
	 no= no/10;
   	
	}
	if(sum == temp)
	  printf("strong number");
	else 
	printf("Not strong number");  
}