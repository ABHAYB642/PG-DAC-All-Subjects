#include <stdio.h>

//void area_1(int l,int b, int *a);

void area_1(int l ,int b,int *a)
{
	*a=l*b; 
}
void main()
{
	int len,bre,area;
    printf("enter length and bradth \n");
	scanf("%d%d",&len,&bre);
	area_1(len,bre,&area);
	printf("Area is %d",area);
	
}


