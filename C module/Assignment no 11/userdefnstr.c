#include<stdio.h>
#include<string.h>

int mystrnstr(char str1[], char str2[], int n);

int main()
{
	char str1[] = "ghanshyam";
	char str2[]= "xyz";
	int n = 7;
	
	if(mystrnstr(str1, str2, n))
	  printf("substring found");
	else 
	 printf("substring not founnd");
	 
	 return 0;
}
int mystrnstr(char str1[], char str2[], int n)
{
	int i, j;
	for(i=0; i<n && str1[i] != '\0'; i++)
	{
		j = 0;
		while(str2[j] !='\0' && (i+j) < n && str1[i+j] == str2[j])
		{
			j++;
		}
		if(str2[j] == '\0')
		 return 1;
	}
	return 0;
}