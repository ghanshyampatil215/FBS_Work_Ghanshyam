#include<stdio.h>
#include<string.h>

int mystrncmp(char str1[], char str2[], int n);

int main()
{
char str1[] = "Ghanshyam";
char str2[] = "Ghanesh";
int n = 4;

if(mystrncmp(str1, str2, n) ==0)
  printf("both string are equal");
else 
  printf("both strings are not equal");
  
  return 0;
}

int mystrncmp(char str1[], char str2[], int n)
{
	int i = 0;
	while(i < n && str1[i] != '\0' && str2[i] != '\0')
   {
   	if(str1[i] != str2[i])
   	{
   		return 1;
	   }
	   i++;
   }
   return 0;
}
