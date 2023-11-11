#include <iostream>

using namespace std;

void swap(int,int);
int main()
{
	int a,b;
	cout<<"enter values of a and b"<<endl;
	cin>>a>>b;
	cout<<"before swapping a and b is"<<a<<b<<endl;
	swap(a,b);
	cout<<"after swapping a and b is "<<a<<b<<endl;
	
	return 0;
	
}

void swap(int p,int q)
{
	
	int temp;
	temp=p;
	p=q;
	q=temp;
	
	cout<<"after swapping p and q is "<<p<<q<<endl;
	
	
}
