#include <stdio.h>

int main()
{
	int i,n,a[n];
	printf("enter the size of array=");
	scanf("%d",&n);
	

	for( i=0;i<n;i++)
	{
		printf("Enter array elements = : ");
			scanf("%d",&a[i]);
		
	}
	
	for( i=0;i<n;i++)
	{
		printf("\n %d ", a[i]);
	
	}
	
	return 0;
}

