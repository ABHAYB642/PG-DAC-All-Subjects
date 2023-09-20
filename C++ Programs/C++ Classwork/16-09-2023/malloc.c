#include <stdio.h>
//malloc in c
//at runtime we have to accept i/p from user and o/p as summation
#include <stdlib.h>

int main()
{
	int n,i,sum;
	
	printf("enter no of elements\n");
	scanf("%d",&n);
	
	int *ptr=(int*)malloc(n*sizeof(int));
	printf("accept the elements of array\n");
	for(i=0;i<n;i++)
	{
	    
		scanf("%d",(ptr+i));	
	}
	for(i=0;i<n;i++)
	{
		sum=(sum + *(ptr+i));	
	}
    printf("summation is %d ",sum);
    
    free(ptr);
    
    return 0;
}
