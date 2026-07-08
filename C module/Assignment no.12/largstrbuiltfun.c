#include<string.h>
#include<stdio.h>
int main()
{
	char str1[100], str2[100];
	int i, len1 = 0, len2 = 0;
	
	
	printf("enter a string :");
	scanf(" %[^\n]", str1);
	
	printf("enter a string :");
	scanf(" %[^\n]", str2);
	
	for(i =0; str1[i] != '\0'; i++)
	{
		len1++;
	}
	for(i=0; str2[i] != '\0'; i++)
	{
		len2++;
	}
	
	if(len1 > len2)
	  printf("larger string = %s", str1);
	else if(len2 > len1)
	   printf("larger string = %s", str2);
	else 
	printf("both string are equal in length.");
	
	return 0;
}