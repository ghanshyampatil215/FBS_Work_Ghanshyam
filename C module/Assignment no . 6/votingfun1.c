#include<stdio.h>
void vote();
int main()
{
     vote();
     return 0;
	
}
void vote()
{
	int no;
	
	printf("enter your age");
	scanf("%d", &no);
	
	if(no >= 18)
	{
		printf("voting eglibible");
	}
	else 
	{
		printf("voting not eligible");
	}
}