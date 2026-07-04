#include<stdio.h>
#include<string.h>

int main()
{
	//strerror()
	printf("strerror =%s\n", strerror(2));
	
	//strcoll()
	printf("strcoll = %d\n", strcoll("abc", "abc"));
	
	return 0;
}