#include<stdio.h>

typedef struct Complex
{
	int real;
	int imaginary;
}Complex;

void store(Complex *);
void display(complex);

void main()
{
	Complex c;
	store(&c);
	display(c);
}

void store(Complex *ptr)
{
	printf("Enter real : ");
	scanf("%d", &ptr->real);
	
	printf("Enter imaginary : ");
	scanf("%d", &ptr->imaginary);
}

void display( Complex c)
{
	printf("\n----Cpmplex---\n");
	printf("real  part     : %d\n", c.real);
	printf("imaginary part : %d\n",c.imaginary);
}

