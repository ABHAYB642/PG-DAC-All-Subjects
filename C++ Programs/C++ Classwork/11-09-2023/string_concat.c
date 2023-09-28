#include <stdio.h>

void uconcat(char*,char*);
int main()
{
	char a[100];
	char b[100];
	printf("enter 1 st string=");
	scanf("%s",a);
	
	printf("\nenter 2 nd string=");
	scanf("%s",b);
	
	uconcat(a,b);
	
	printf("concatenated string is = %s",a);
}

void uconcat(char* p, char* q)
{
	while(*p!='\0')
	{
		p++;
	}
	
	while(*q!='\0')
	{
		*p=*q;
		p++;
		q++;
	}

	
}


