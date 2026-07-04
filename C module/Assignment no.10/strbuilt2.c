#include<stdio.h>
#include<string.h>

int main()
{
	char str[] = "Patil, Ghanshyam,dilip";
	
    printf("strch = %s\n", strchr("Royal", 'y'));
    
    printf("strchr = %s\n", strchr("Ghanshyam", 'a'));
    
    printf("strtok =%s\n", strtok(str, ","));
    printf("strtok =%s\n", strtok(NULL, ","));
    printf("strtok = %s\n", strtok(NULL, ","));
    
    return 0;
}