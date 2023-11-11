#include <stdio.h>
#include <string.h>

int main(){
	char a[10];
	char b[10];
    printf("enter string=");
	scanf("%s",a);
	
	strcpy(b,a);
	strrev(a);
	strcmp(a,b);
	
	if(strcmp(a,b)==0)
	{
		printf("string is pallindrome");
	}
	else
	{
		printf("string is not pallindrome");
	}
	
	return 0;
}


