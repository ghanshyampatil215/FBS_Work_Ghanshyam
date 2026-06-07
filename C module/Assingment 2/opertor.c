//Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the
//desired operations.


void main()
{
	int a = 24;
	int b = 42;
	char op = '/';
	if(op == '+'){
		printf("%d", a+b);
	}else if(op == '-'){
		printf("%d" ,a-b);
	}else if (op == '*'){
		printf("%d" , a*b);
	}else if(op == '/'){
		printf("%d", a/b);
	}else if(op == '%'){
		printf("%d", a%b);
	}
}