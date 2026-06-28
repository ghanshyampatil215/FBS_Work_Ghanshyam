#include<stdio.h>
void rev (int *no);
int main()
{
	int no;
	printf("Enter your number");
	scanf("%d", &no);
	
	rev(&no);
	return 0;
	
}

	void rev(int *no)
	{

	int rev;
	int r1, r2, r3;
	int q1, q2;
	
   r1 = *no%10;
   q1 = *no/10;
   
   r2 = q1%10;
   q2 = q1/10;
   
   r3 = q2 % 10;
   
   rev = r1*100 + r2*10 + r3;
   if(*no == rev){
   	 printf("palindrome");
   	
   }else 
	{
		printf("not palindrome");
	}
}