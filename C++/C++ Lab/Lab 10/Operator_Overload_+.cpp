#include<iostream>
using namespace std;

class Complex
{
	int real,img;
	public:
		Complex()
		{
			
		}
		Complex(int r,int i)
		{
			real=r;
			img=i;
		}
		void display()
		{
			if(img>0)
			cout<<"Complex no is "<<real<<"+"<<img<<"i"<<endl;
	        else
	        cout<<"Complex no is "<<real<<img<<"i"<<endl;
	        
		}
		Complex operator-(Complex &c)
		{
			Complex temp;
			temp.real=this->real - c.real;
			temp.img=this->img - c.img;
			return temp;
		}
		Complex operator+(Complex &c)
		{
			Complex temp;
			temp.real=this->real+c.real;
			temp.img=this->img + c.img;
			return temp;
		}
		Complex operator-()
		{
			Complex temp;
			temp.real=-this->real;
			temp.img=-this->img;
			return temp; 
		}
};
int main()
{
	cout<<"_"<<endl;
	Complex c1(2,3);
	Complex c2(4,5);
	Complex c3=c1-c2; //c1.operator-(c2)
	c3.display();
	
	cout<<endl;
	cout<<"+"<<endl;
	Complex c4(6,5);
	Complex c5(7,8);
	Complex c6=c4+c5; //c4.operator+(c5)
	c6.display();
	
   cout<<endl;
	cout<<"negation"<<endl;
	Complex c7(5,6);
	Complex c8=-c7; //c8=c7.opearator-()
	c8.display();
	
}
