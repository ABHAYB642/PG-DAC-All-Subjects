#include <iostream>
using namespace std;
class A
{
	int x;
	public:
	A()
	{
		cout<<"in default of A \n";
		
	}
	A(int x)
	{
		this->x=x;
		cout<<"in para of A \n";
	}
	~A()
	{
		cout<<"in destructor of A \n";
	}
};
class B : public A
{
		int y;
	public:
	B()
	{
		cout<<"in default of B \n";
		
	}
	B(int y)
	{
		this->y=y;
		cout<<"in para of B \n";
	}
	~B()
	{
		cout<<"in destructor of B \n";
	}
};
class C : public A
{
	int z;
	public:
	C()
	{
		cout<<"in default of C \n";
		
	}
	C(int z)
	{
		this->z=z;
		cout<<"in para of C \n";
	}
	~C()
	{
		cout<<"in destructor of C \n";
	}
};
int main()
{
	B b1;
	C c1;
}
