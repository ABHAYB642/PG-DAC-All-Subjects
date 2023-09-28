#include <stdio.h>
void ustrcpy(char *,char *);
int main()
{
	char a[7];
	printf("enter string in a =\n");
	gets(a);
	//puts(a);
	char b[7];
	ustrcpy(b,a);
	printf("string copied in b= %s",b);
	//puts(b);
	return 0;
}

void ustrcpy(char *q,char *p)
{
	while(*p!='\0')
	{
		*q=*p;
		p++;
		q++;
	}
	*q='\0';
}
