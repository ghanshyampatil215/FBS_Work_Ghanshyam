#include<stdio.h>
#include<string.h>

int main()
{
	char str1[] = "Ghanshyam";
	char str2[20];
	
	// memcpy()
	memcpy(str2, str1, strlen(str1) + 1);
	printf("memcpy = %s\n", str2);
	
	//memcmp()
	printf("memcmp = %d\n", memcmp("abc", "abd", 2));
	
	// memset()
	memset(str2, '*', 1);
	printf("memset = %s\n", str2);
	
	return 0;
	
}