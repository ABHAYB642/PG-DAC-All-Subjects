#include<iostream>
using namespace std;
#include<string.h>
//array char pointer to string


int main()
{
	char* name[5]={"ram","rohan","rachana","rain","regel"};
	
	for( int i=0; i<5;i++)
	{
	int x=strlen(*(name+i));
		
		for(int j=0;j<=x;j++)
		{
			cout<<*(*(name+i)+j);
			
		}
		cout<<endl;
	}
	return 0;
}
