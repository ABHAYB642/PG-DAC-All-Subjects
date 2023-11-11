#include<iostream>
using namespace std;

void ustrcpy(char*p,char*q);

int main()
{
    char *a,*b;
	cout<<"\n Enter your String1:";
	a=new char[5];
	cin>>a;
	b=new char[5];
    ustrcpy(b,a);
    cout<<"Copied string : "<<b;
    delete []a;
    delete []b;
    
}
void ustrcpy(char*q,char*p)
{
	while(*p!='\0')
	{
		*q=*p;
		p++;
		q++;
	}
}

