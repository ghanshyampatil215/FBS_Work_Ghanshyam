//Accept the age and check if the person is:
//Child (age < 12),Teenager (12–19),Adult (20–59),Senior (60 and above)

void main()
{
	int age = 56;
	if(age <12){
		printf("child");
	}else if(age<=19){
		printf("teenager");
	}else if(age<=59){
		printf("adult");
	}else printf("senior");
}