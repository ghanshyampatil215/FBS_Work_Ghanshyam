#include<stdio.h>
int  pallindrome (int no);
int main()
{
	int no;
	printf("Enter your number");
	scanf("%d", &no);
	
	int result = pallindrome(no);
	if (no % 2 == 0){
	printf("pallindrome number");
    }
    else
    {
    printf("not pallindrome nummber");	
	}
	
	
	pallindrome(no);
	return 0;
	
}

	int pallindrome(int no)
	{

	int rev;
	int r1, r2, r3;
	int q1, q2;
	
   r1 = no%10;
   q1 = no/10;
   
   r2 = q1%10;
   q2 = q1/10;
   
   r3 = q2 % 10;
   
   rev = r1*100 + r2*10 + r3;
   if(no == rev){
   	  return 0;
   	
   }else 
	{
		return 1;
	}
}