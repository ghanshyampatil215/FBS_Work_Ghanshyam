#include<stdio.h>

typedef struct Employee
{
    int Id;
    float salary;
    char name[20];
}Employee;

void store(Employee *e);
void display(Employee );

void main()
{

  Employee e;
  
  store(&e);     //pass by address
  display(e);   //pass by value

}

void store(Employee *ptr)
{
	
	printf("Enter Employe Id : ");
	scanf("%d", &ptr->Id);
	
	printf("Enter name : ");
	scanf("%s", ptr->name);
	
	printf("Enter salaxy:");
	scanf("%f", &ptr->salary);
}

void display(Employee e)
{
	printf("\n------Employe Deatils------\n");
	printf("Employe Id      : %d\n", e.Id);
	printf("Name            : %s\n", e.name);
    printf("salaxy          : %.2f\n", e.salary);
}