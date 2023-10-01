#include<iostream>
using namespace std;
void ustrcpy(char*,char*);
int main(){
	char a[20];
	cout<<"enter string 1"<<endl;
	cin>>a;
	char b[20];
	 ustrcpy(a,b);
	 cout<<"copied string :"<<b;
}
void ustrcpy(char *p,char *q)
{
	while(*p!='\0')
	{
		*q=*p;
		p++;
		q++;
	}
	*q='\0';
}
