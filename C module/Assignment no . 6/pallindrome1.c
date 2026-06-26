#include<stdio.h>
void  pallindrome ();
int main()
{
	pallindrome();
	
}

	void pallindrome()
	{
     int no;
	int rev;
	int r1, r2, r3;
	int q1, q2;
	
	printf("Enter your number");
	scanf("%d", &no);
	
   r1 = no%10;
   q1 = no/10;
   
   r2 = q1%10;
   q2 = q1/10;
   
   r3 = q2 % 10;
   
   rev = r1*100 + r2*10 + r3;
   if(no == rev){
   	 printf("pallinddrome number");
   	
   }else 
	{
		printf("not pallindrome number");
	}
}