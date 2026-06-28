#include<stdio.h>
void reverse(int *n);
int main()
{
	int num;
	 
	 
	 printf("enter your number");
	scanf("%d", &num);
	
	reverse(&num);
}
	void reverse(int *n)
	{
		int rev= 0, r, no;
		no =*n;
	
	while(no!=0)
	{
		r=no%10;
		rev = rev*10+r;
		no=no/10;
		
		
	}printf("%d", rev);
}