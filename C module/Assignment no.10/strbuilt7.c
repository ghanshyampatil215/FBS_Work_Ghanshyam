#include<stdio.h>
#include<string.h>

int main()
{
	char str1[20];
	char str2[]= "paTIl";
	
	
	//strxfrm()
	strxfrm(str1, str2, 20);
	printf("strxfrm = %s\n", str1);
	
	//strupr
	
	printf("strupr=%s\n", strupr(str2));
	
	// strlwr()
	printf("strlwr = %s\n", strlwr(str2));

	return 0;
}