#include<stdio.h>
#include<string.h>

int main()
{
	char str[] = "pShyam";
	
	// memmove()
	memmove(str + 0, str,6);
	printf("memmove = %s\n", str);
	
	//memchr()
	printf("memchr = %s\n", (char *)memchr("shyam", 'h',3));
	
	//strcsp()
	printf("strcspn = %lu\n", strcspn("Shyam", "m"));
	
	return 0;
	
}