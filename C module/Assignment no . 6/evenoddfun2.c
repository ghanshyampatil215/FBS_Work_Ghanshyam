#include<stdio.h>
int fun1();
int main()
{
    int result;
    result = fun1();
	if(result == 0) 
	{
	printf("even number");
} 
else
{
	printf("odd number");
  
}

}
int fun1()
{
int no ;
printf("Enter your number");
scanf("%d", &no);
if(no % 2== 0)
{
	return 0;
}
else
 {
	return 1;
}
}
