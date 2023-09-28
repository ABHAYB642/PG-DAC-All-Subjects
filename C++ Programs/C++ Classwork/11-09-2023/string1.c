#include <stdio.h>

int ustrlen(char*);

int main()
{
	int x;
	char a[10]; 
	printf("enter string=\n");
	scanf("\n%s",a);
	x=ustrlen(a);
	printf("\nlength of string is %d\n",x);
}

int ustrlen(char *p)
{
	int len = 0;
	while(*p!='\0')
	{
		len++;
		p++;
	}
	return len;
}
