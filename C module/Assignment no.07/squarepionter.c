#include<stdio.h>
int square(int *n);
int main()
{
	int num;
	printf("enter your number");
	scanf("%d", &num);
    square(&num);
    
    return 0;
	
}
int square(int *n)
{	
	printf("square = %d\n", (*n) * (*n));

}