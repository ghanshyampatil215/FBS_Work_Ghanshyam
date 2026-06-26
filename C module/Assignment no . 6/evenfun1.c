#include<stdio.h>
int vote();
int main()
{
	int res = vote();
	if(res == 0)
	{
		printf("voting eglible");
		
	}else printf("voting not eglible");
	
}


int  vote()

{
	int num ;
	printf("enter your nu ");
	scanf("%d", &num);
	
	if( num >= 18){
		return 0;
	}else return 1;
	
}