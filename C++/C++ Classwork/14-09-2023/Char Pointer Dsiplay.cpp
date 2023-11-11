#include<iostream>
using namespace std;
#include<string.h>
//array char pointer to string
void display(char *a[]){
		for( int i=0; i<5;i++)
	{
	int x=strlen(*(a+i));
		
		for(int j=0;j<=x;j++)
		{
			cout<<*(*(a+i)+j);
			
		}
		cout<<endl;
	}
}

int main()
{
	char* name[5]={"ram","rohan","rachana","rain","regel"};
	

	display(name);
	return 0;
}
