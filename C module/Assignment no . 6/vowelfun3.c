#include<stdio.h>
int check();
int  main()
{
	int res = check();
	if (res == 0)
	{
	printf("vowel ");	
} else printf ("not vowel ");
}

int check ()
{
	
	char ch ;
	printf("enter your cha");
	scanf(" %c", &ch);
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	{
		return 0;

	}
	else
	{
	  return 1;
   }

}