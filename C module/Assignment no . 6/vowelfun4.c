#include<stdio.h>
void check();
int  main()
{
	
	check();
  
}

void check ()
{
	char ch;
	printf("enter your character");
	scanf(" %c", &ch);
	
	if(ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u' ||
	    ch=='A' || ch=='E'  || ch=='I' || ch=='O' || ch=='u')
	{
		printf("vowel ");	
} 
else
 {
printf ("not vowel ");
}

}

