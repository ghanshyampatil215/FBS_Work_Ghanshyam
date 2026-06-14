//1. Even/Odd
//2. Prime
//3. Palindrome
//4. Positive/Negative/Zero
//5. Reverse
//6. Sum of Digits


void main()
{
	int no =121;
    int  i =2;
    int flag=0;
	int choice=6;
	
switch(choice)
{

   case 1 :
   if(no % 2== 0)
	printf("even number");
   else
    printf("odd number");
	break;
	
	case 2:
	 for( int  i=2 ; i<no; i++)
	 {
	 	if(no%i==0)
	 	{
	 		flag = 1;
	 		break;
		 }
	 }
	 
	 if(flag == 0 && no>1)
	 
	 	printf("prime number");
	 	
	 else 
	 	printf("not prime number");
	 
	 break;
	 
	 case 3:
	 {
	 
	 int r1,r2,r3;
	 int q0,rev;
	 
	 r1=no%10;
	 q0=no/10;
	 
	 r2=q0%10;
	 r3=q0/10;
	 
	 rev=r1*100+r2*10+r3*1;
	if(no == rev)
	  printf("pallindrome number");
	  
	  else 
	  printf(" not pallindrome number");
	 
	 break;
	 
}
  case 4:
  	if(no>0){
  		printf("positive number");
	  }
	  else if(no<0)
	  {
	  	printf("negative numer");
	  }else {
	  	printf("zero");
	  }
   break;
   
   case 5:
   {
	 int rev= 0;
    int temp = no;
    int rem;
    
     while(temp != 0)
     {
     	   rem = temp%10;
     	   rev= rev*10 + rem;
     	   temp= temp/10;
	 }
     printf("%d", rev);
  break;
}

 case 6:
    	{
    	 int sum=0;
    	 int temp =no;
    	 int rem;
    	 
    	 while(temp!=0)
    	 {
    	 	rem= temp%10;
    	 	sum=  sum+rem;
    	 	temp=temp/10;
        }
        printf("sum = %d", sum);
    	 	
    	 break;	
    	 	
		}
	}
}
	
	
	
	
	
	
	
	
	
	
