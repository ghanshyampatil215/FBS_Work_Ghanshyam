#include<stdio.h>

int mystrncasecmp(char str1[], char str2[], int n);

int main()
{
	char str1[] = "GHANSHYAM";
	char str2[] ="ghanPATIL";
	int n = 4;
	
	if(mystrncasecmp(str1, str2, n) == 0)
	  printf("both string are equal");
	else 
	printf("both string are not equal");
	
	return 0;
}

int mystrncasecmp(char str1[], char str2[], int n)
{
	int i = 0;
	char ch1, ch2;
	
	while(i < n && str1[i]!= '\0' && str2[i] != '\0')
	{
		ch1 = str1[i];
		ch2 = str2[i];
		
		if(ch1 >= 'A' && ch1 <= 'Z')
		   ch1 = ch1 + 32;
		   
		if(ch2 >= 'A' && ch2 <= 'Z')
		    ch2 = ch2 + 32;
		    
		if(ch1 != ch2)
		  return 1;
		      
		i++;
	}
	return 0;
}