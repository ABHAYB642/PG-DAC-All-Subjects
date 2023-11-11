#include<iostream>
using namespace std;
#include<string.h>
//array char pointer to string//array of pointer to string
char* name[5];
void getdata();
int main()
{

	getdata();
	for( int i=0; i<5;i++)
	{
	int x=strlen(*(name+i));
		cout<<x<<endl;
		for(int j=0;j<=x;j++)
		{
			cout<<*(*(name+i)+j);
			
		}
		cout<<endl;
	}
	return 0;
}

void getdata()
{
	int i;
	cout<<"enter 5 names ="<<endl;
	for(i=0;i<5;i++)
	{
		cin>>*(name+i);
		
	}
	
}
