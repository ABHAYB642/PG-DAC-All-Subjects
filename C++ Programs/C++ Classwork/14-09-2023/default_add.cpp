#include<iostream>
using namespace std;

void add(int=1,int=2, int=3, int=4);

int main()
{
	
	
	add();
	cout<<endl;
	add(10);
	cout<<endl;
	add(10,20);
	cout<<endl;
	add(10,20,30);
	cout<<endl;
	add(10,20,30,40);
	cout<<endl;

}

void add(int a,int b,int c,int d)
{
	cout<<a+b+c+d<<endl;
}
