#include<stdio.h>
int vote(int no);
int main()
{
	
	int num;
	printf("enter your age ");
	scanf("%d", &num);
	int res = vote(num);
	if(res == 0)
	{
		printf("voting eglible");
		
	}else printf("voting not eglible");
	vote(num);
}
  

int  vote(int no)

{

	if( no >= 18){
		return 0;
	}else return 1;
	
}