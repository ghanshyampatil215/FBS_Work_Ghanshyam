#include<stdio.h>
void evenOdd(int no);
void main()
{
     int no;
     printf("enter your number");
     scanf("%d", &no);
     
     evenOdd(no);
     
     
}
void evenOdd(int no)

{
	if(no % 2 ==0)
	{
	 printf("even number");
   }
   else 
   {
   	printf("odd number");
   }
	
}




