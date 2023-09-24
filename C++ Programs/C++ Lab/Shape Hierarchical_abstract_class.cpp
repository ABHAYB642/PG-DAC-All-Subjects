#include<iostream>
using namespace std;
class Shape
{
	public:
		Shape();
		virtual int area=0;//pure virtual fun	
};
class Square:public Shape
{
	int side;
	public:
		Square(){
			cout<<"In default of Square"<<endl;
		}
		Square(int s){
			side=s;
		}
		int area()
		{
			area=side*side;
			return area;
		}
};
class Rectangle:public Shape
{
	int l,b;
	public:
		Rectangle(){
			cout<<"In default of Rectangle"<<endl;
		}
		Rectangle(int l,int b){
			this->l=l;
			this->b=b;
		}
		int area()
		{
			area=l*b;
			return area;
		}	
};
int main()
{
	Shape *sptr = new Square(5)
	int a=sptr->area();
	cout<<"Area of square = "<<a<<endl;
	
	Shape *sptr = new Rectangle(5,4)
	int a=sptr->area();
	cout<<"Area of rectangle = "<<a<<endl;
}
