#include<stdio.h>


int mystrcmp(char str1[], char str2[]);
int main()
{
	char str1[]= "ghanshyam";
	char str2[]= "shyam";
	
     if(mystrcmp(str1 , str2) == 0)
     {
     	printf("both string equal");
	 }
	 else
	 {
	 	printf(" both string  are not equal");
	 }
	 return 0;
}
int mystrcmp(char str1[], char str2[])
{
	int i =0;
	
	while(str1[i] != '\0' && str2[i] != '\0')
	{
	
	   if(str1[i] != str2[i])
	  {
	  	
	   return 1;
	   
	  }
	  i++;
	  
    }
    
	if(str1[i] == str2[i])
         return 0;
    else 
        return 1;
}