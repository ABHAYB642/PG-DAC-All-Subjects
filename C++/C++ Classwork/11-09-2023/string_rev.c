#include <stdio.h>

int ustrlen(char*);
void urev();
int x;
	int y=0;
	char a[10];
	char b[10];
int main()
{
	
	
	printf("enter the string=\n");
	scanf("%s",a);
	x=ustrlen(a);
	printf("\nlength of string is %d\n",x);
	urev();
}

void urev()
{
	x=x-1;
	while(x>=0)
	{
		b[y]=a[x];
		x--;
		y++;
		
	}
	b[y]='\0';
	printf("reverse string is %s\n",b);
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
