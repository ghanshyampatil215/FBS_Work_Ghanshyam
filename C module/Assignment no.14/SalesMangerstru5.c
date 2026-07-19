#include<stdio.h>

typedef struct SalesManger
{
	int id;
	char name[20];
	float salary;
	float incentive;
	int target;
}SalesManger;

//function Prototypes
void stores(SalesManger *);
void display(SalesManger);

void main()
{
	SalesManger s;
	
	stores(&s);   //pass by address
	display(s);   //pass by value
}

void stores(SalesManger *ptr)
{
	printf("Enter SalesManger ID : ");
	scanf("%d", &ptr->id);
	
	printf("Enter SalesManger name : ");
	scanf("%s", ptr->name);
	
	printf("Enter SalesManger salary : ");
	scanf("%f", &ptr->salary);
	
	printf("Enter SalesManger incentive : ");
	scanf("%f", &ptr->incentive);
	
	printf("Enter SalesManger target : ");
	scanf("%d", &ptr->target);
}

void display(SalesManger s)
{
	printf("\n-----SalesMangers-----\n");
	printf("SalesMangers Id     :  %d\n", s.id);
	printf("name                :  %s\n", s.name);
	printf("salary              :  %.2f\n", s.salary);
	printf("incentive           :  %.2f\n",s.incentive);
	printf("target              :  %d\n", s.target);
}









