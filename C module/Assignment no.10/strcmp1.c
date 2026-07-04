#include<stdio.h>
#include<string.h>

int main()
{
	char str1 [100] = "First";
	char str2[100] = "bit";
	char str3[100] = "hello";
	char str4[100];
	
	printf("length = %u\n", strlen(str1));
	
	strcpy(str3, str1);
	printf("copy= %s\n", str3);
	
	strcat(str1, str2);
	printf("total = %s\n", str1);
	
	
	printf("compare = %d\n", strcmp("lmn", "bcd"));
	
	printf("substring = %s\n", strstr("firstbit", "r"));
	
	return 0;

}