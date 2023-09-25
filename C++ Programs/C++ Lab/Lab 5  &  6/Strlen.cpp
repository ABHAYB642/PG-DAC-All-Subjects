#include<iostream>
using namespace std;

int ustrlen(char*p);

int main()
{   
    char*a;
    int len; 
    a=new char[10];
	cout<<"\n Enter your String1:";
	cin>>a;
    len=ustrlen(a);
    cout<<"Length of string : "<<len;
    delete []a;
}
int ustrlen(char*p)
{
    int len=0;
	while(*p!='\0')
	{
        len++;
		p++;
	}
    return len;
}
