#include<stdio.h>

typedef struct product
{
	int id;
	char name[20];
	int quantity;
	float price;
}product;

void store(product*);
void display(product);

void main()
{
	product p;
	
	store(&p);
	display(p);
}

void store(product *ptr)
{
	printf("Enter ID : ");
	scanf("%d", &ptr->id);
	
	printf("Enter name : ");
	scanf("%s", ptr->name);
	
	printf("Enter Quantity : ");
	scanf("%d", &ptr->quantity);
	
	printf("Enter price : ");
	scanf("%f", &ptr->price);
}

void display(product p)
{
	printf("\n-----Product Details----\n");
	printf("Product ID  : %d\n", p.id);
	printf("name        : %s\n", p.name);
	printf("quantity    : %d\n", p.quantity);
	printf("price       : %.2f\n", p.price);
}








