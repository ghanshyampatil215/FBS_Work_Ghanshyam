void main()
{
float basic = 40000;
float da, ta, hra, total;

if(basic<=5000){
	da = basic * 10/100;
	ta = basic * 10/100;
	hra = basic * 10/100;

}else
{
	da = basic * 15/100;
	ta = basic * 25/100;
	hra = basic * 30/100;
}

 total = basic + da + ta + hra;

printf("total salary %2f", total);
}