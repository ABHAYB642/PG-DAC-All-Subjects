#include <iostream>
using namespace std;

int main()
{
	int a =10;
	int &b = a;
	int &c = a;
	
	cout<<&a<<endl;
	cout<<&b<<endl;
	cout<<&c<<endl;
	
	c=30;
	cout<<a<<b<<c;
}
