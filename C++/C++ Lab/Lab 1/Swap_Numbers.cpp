#include<iostream>
#include<math.h>
using namespace std;
int main(){
	int a,b;
	
	cout<<"enter two numbers "<<endl;
	cin>>a>>b;
	
	swap(a,b);
	cout<<"Swapped numbers are "<<a<<" "<<b<<endl;
	
	return 0;
	
}

void swap(int p,int q)
{
	int temp;
	temp=p;
	p=q;
	q=temp;
}
