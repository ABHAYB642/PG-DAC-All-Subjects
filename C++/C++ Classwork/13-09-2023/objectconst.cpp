#include <iostream>

using namespace std;

class Complex
{
	int real,img;
	public:
	 
	 Complex()
	 {
	   real=1;
	   img=2;
	   	
	 }	
	 Complex(int r,int i)
	 {
	 	real=r;
	 	img=i;
	 }
	 void show()const
	 {
	 	cout<<"comlex no is="<<real<<"+"<<img<<"i"<<endl;
	 	
	 }
	 int getReal()const
	 {
	 	return real;
	 }
	 void setReal(int r)
	 {
	 	real = r;
	 }
	 
};

int main()
{
	const Complex c1;
	cout<<"const member function using const obj"<<endl;
	c1.show();
	Complex c2(4,5);
	cout<<"const member function using non const obj"<<endl;
	c2.show();
	
	c2.setReal(8);
	cout<<"nonconst setter using non const obj"<<endl;
	c2.show();
	cout<<"modified real value using non const obj is="<<c2.getReal()<<endl;
	cout<<"modified real value using const obj is="<<c1.getReal();
}
