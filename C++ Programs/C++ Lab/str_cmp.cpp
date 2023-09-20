#include<iostream>
using namespace std;
void compare(char*,char*);
int main()
{
	char *a = new char[15];
	char *b = new char[15];
	cout<<"\n Enter your String1:";
	cin>>a;
	cout<<"\n Enter your String2:";
	cin>>b;
	compare(a,b);
	delete []a;
	delete []b;
	
	return 0;
}
void compare(char *p,char *q)
{
	int i=0; int flag=0;
	while(p[i]!='\0')
	{
		if(p[i]==q[i])
		{
			flag=0;
		}
		else
		{
			flag=1;
			break;
		}
		i++;
	}
	if(flag == 0)
	{
		cout<<"String same";
	}
	else
	{
		cout<<"String not same";
	}
	
}
