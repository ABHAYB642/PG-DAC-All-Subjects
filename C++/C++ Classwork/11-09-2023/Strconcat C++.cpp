#include<iostream>
using namespace std;
void ustrconcat(char*,char *);
int main(){
	char a[20];
	char b[20];
	cout<<"Enter A: "<<endl;
	cin>>a;
	cout<<"Enter B: "<<endl;
	cin>>b;
	ustrconcat(a,b);
	cout<<"Concat string is: "<<a<<endl;
}
void ustrconcat(char*p,char *q){
	while(*p!='\0'){
		p++;
	
	}
	while(*q!='\0'){
		
		*p=*q;
		p++;
		q++;
	}

}
