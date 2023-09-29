#include<iostream>
using namespace std;
int ustrlen(char *);

int main(){
	char a[20];
	cout<<"Enter String : "<<endl;
	cin>>a;
	cout<<"string length "<<ustrlen(a);
}
int ustrlen(char *p){
	int cnt=0;
 	while(*p!='\0')
	{
			cnt++;
			p++; 	
	}
	return cnt;	
}

