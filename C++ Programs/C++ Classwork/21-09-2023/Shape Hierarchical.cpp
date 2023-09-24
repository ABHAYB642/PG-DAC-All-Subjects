#include<iostream>
using namespace std;
class Shape
{
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
