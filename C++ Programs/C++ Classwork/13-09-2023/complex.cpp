#include <iostream>

using namespace std;

class Complex
{
    int real,img;
	public:
	  void getData()
	  {
	  	cout<<"accept real and img values"<<endl;
	  	cin>>real>>img;
	  	
	  }	
	  void display()
	  {
	  	cout<<" complex no is " << real<<"+"<<img<<"i"<<endl;
	  }
	  void acceptparam(int,int);
	  void setReal(int r)//only real value we can set in same obj
	  {
	  	real=r;
	  }
	  int getReal()//only real value will print
	  {
	  	return real;
	  }
};
void Complex :: acceptparam(int r,int i)//outline function
{
	real=r;
	img=i;
}
int main()
{
	Complex c1;
	cout<<"sizeof c1"<<sizeof(c1)<<endl;
	c1.getData();
	c1.display();
	Complex c2;
	c2.acceptparam(10,2);
	c2.display();
	
	c2.setReal(20);
	c2.display();
	
	cout<<"modified real part is "<<c2.getReal();
}
