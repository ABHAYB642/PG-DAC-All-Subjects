#include <stdio.h>
//malloc in c

#include <stdlib.h>

int main()
{
	int n;
	printf("enter no of char\n");
	scanf("%d",&n);
	char* ptr=(char*)malloc(n*sizeof(char)+1);
	
	printf("accept string\n");
	scanf("%s",ptr);
	printf("display string\n");
	printf("%s",ptr);
	
	free(ptr);
}
	
