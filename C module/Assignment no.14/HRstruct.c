#include<stdio.h>

typedef struct HR
{
	int Id;
	int salary;
	char name[100];
	int commission;
}Hr;

//functioon prototype
void Store(Hr*);
void display(Hr);

void  main()
{
	Hr h;
	
	store(&h);  //pass by address
	display(h);    //pass by value
}

void store(Hr *ptr)
{
	printf("Enter HR id : ");
	scanf("%d", &ptr->Id);
	
	printf("Enter HR salary : ");
	scanf("%d", &ptr->salary);
	
	printf("Enter HR name : ");
	scanf("%s", ptr->name);
	
	printf("Enter HR commisssion : ");
	scanf("%d", &ptr->commission);
}
void display(Hr h)
{
	printf("\n-----HR Details-----\n");
	printf("HR Id       :  %d\n", h.Id);
	printf("salary   :  %d\n", h.salary);
	printf("name     :  %s\n", h.name);
	printf("commission :  %d\n", h.commission);
}














 