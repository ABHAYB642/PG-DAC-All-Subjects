#include<iostream>
using namespace std;
#include<string.h>

void strconcat(char*p,char*q);
int main()
{

	char *a,*b;
	cout<<"\n Enter your String 1:";
	a=new char[15];
	cin>>a;
	cout<<strlen(a)<<endl;
	cout<<"\n Enter your String 2:";
	b=new char[15];
	cin>>b;
	cout<<strlen(b)<<endl;
	strconcat(a,b);
	cout<<"\nConcate String : "<<a;
	
	delete []a;
	delete []b;
	return 0;	
}
 void strconcat(char*p,char*q){
 	while(*p!='\0')
 	{p++;}
 	while(*q!='\0'){
 		*p=*q;
 		p++;
 		q++;
	 }	
	 *q = '\0';
 }
