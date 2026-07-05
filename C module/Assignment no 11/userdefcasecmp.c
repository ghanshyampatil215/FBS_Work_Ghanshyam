#include<stdio.h>
#include<string.h>

int mystrcasecmp(char stsr1[], char str2[]);

int main()
{
	char str1[] = "Ghanshyam";
	char str2[] = "Ghanshyam";
	
	if(mystrcasecmp(str1, str2) ==0)
	   printf("both string are equal");
	else 
	printf("both strings are not equal");
	
	return 0;
}

int mystrcasecmp(char str1[], char str2[])
{
	int i= 0;
	char ch1, ch2;
	
	while(str1[i] != '\0' && str2[i] != '\0')
	{
		ch1 = str1[i];
		ch2 = str2[i];
		
		if(ch1 >= 'A' && ch1 <= 'Z')
		    ch1 = ch1+32;
		    
		if(ch2 >= 'A' && ch2 <= 'Z')
		  ch2 = ch2 + 32;
		  
		  if(ch1 != ch2)
		    return 1;
		    
		    i++;
	}
	if(str1[i] == str2[i])
	   return 0;
	else 
	  return 1;
		      
	}
