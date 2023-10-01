#include<iostream>
using namespace std;
void ustrrev(char *,char *);
int ustrlen(char *);

int main(){
	
	char b[20];
    char a[20];
	cin>>a;
	int x=ustrlen(a);
	ustrrev(a,b);
	cout<<"Reverse string is "<<b<<endl;
}
void ustrrev(char *p,char*q){
	int x=x-1;
	int y=0;
	while(x>=0)
	{
		q[y]=p[x];
		y++;
		x--;
//	p=q;
//	p++;
//	q--;
	}
	q[y]='\0';
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
