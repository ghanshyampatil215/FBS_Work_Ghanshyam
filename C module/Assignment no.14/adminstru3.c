#include<stdio.h>

typedef struct Admin 
{
	int Id;
	int salary;
	float allowance;
	char name[20];
} Admin;

// function prototype

void store(Admin *);    //pass by address
void display(Admin);    //paass by value

void main() 
{
	Admin a;
	
	store(&a);    //pass by address
	display(a);    //paass by value

}
// store Admin Details
void store(Admin *ptr)
{
	printf("Enter Admin Id : ");
	scanf("%d", &ptr->Id);
	
	printf("Enter Admin salary : ");
	scanf("%d", &ptr->salary);
	
	printf("Enter Admin name : ");
	scanf("%s", ptr->name);
	
	printf("Enter Admin allowance : ");
	scanf("%f", &ptr->allowance);
	
}
void display(Admin a)
{
	printf("\n------Admin Details----\n");
	printf("Admin Id     :   %d\n", a.Id);
	printf("Admin salary :   %d\n", a.salary);
	printf("Admin name   :   %s\n", a.name);
	printf("Admin allowance : %f\n", a.allowance);
}








