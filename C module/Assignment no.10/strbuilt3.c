#include<stdio.h>
#include<string.h>

int main()
{
	char str1[100] = "shyam";
	char str2[] = "patil";
	char str3[100];
	
	// strncpy()
	strncpy(str3, str1, 3);
	str3[3] = '\0';
	printf("strncpy = %s\n", str3);
	
	///strncat()
	strncat(str1,str2,2);
	printf("strncat = %s\n", str1);
	
	return 0;
	}