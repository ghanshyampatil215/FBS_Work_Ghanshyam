//Accept the price from user. Ask the user if he is a student (user may say y or n). If he
//is a student and he has purchased more than 500 than discount is 20% otherwise
//discount is 10%.But if he is not a student then if he has purchased more than 600
//discount is 15% otherwise there is not discount.

void main(){
	int price = 800;
     char student = 'y';
    
    if(student =='y'){
    	if(price > 500)
    	{
    		printf("%d", price* 20/100);
		} 
		else {
			printf("%d", price *10/100);
		}
	}
	else
	{
		if(price > 600)
		{
		printf("%d", price* 15/100);	
		}else 
		{
			printf("%d", price* 0);
		}
	}
}