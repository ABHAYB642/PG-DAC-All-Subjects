#include <iostream>
using namespace std;
#include "Shape.h"
#include "Point.h"
#include "Line.h"
#include "Rectangle.h"
#include "Square.h"
#include "Circle.h"
#include "Ellipse.h"
#define PI 3.142


int main()
{
	int x,y,choice,ch,tk;
	Shape *ptr1;
	
	do
{
	cout<<"1.Point\n2.Line\n3.Rectangle\n4.Square\n5.Circle\n6.Ecllipse"<<endl;
	cin>>ch;
	switch(ch)
	{
		case 1: //point
			cout<<"enter start points:"<<endl;
			cin>>x>>y;
			ptr1=new Point(x,y);
//			cout<<"Enter thickness";
//			ptr1->setThikness();
			ptr1->display();
			break;
		case 2:  //line
			cout<<"enter start points:"<<endl;
			cin>>x>>y;
			ptr1=new Line(x,y);
			cout<<"Enter thickness";
			cin>>tk;
			ptr1->setThikness(tk);
			ptr1->display();
			break;
		case 3:  //rectangle
			cout<<"enter length & breadth:"<<endl;
			cin>>x>>y;
			ptr1=new Rectangle(x,y);
			cout<<"Enter thickness";
			cin>>tk;
			ptr1->setThikness(tk);
			ptr1->display();
			break;
		case 4:  //square
			cout<<"enter side:";
			cin>>x;
			ptr1=new Square(x);
			cout<<"Enter thickness"<<endl;
			cin>>tk;
			ptr1->setThikness(tk);
			ptr1->display();
			break;
		case 5:  //Circle
			cout<<"enter radius:"<<endl;
			cin>>x;
			ptr1=new Circle(x);
			cout<<"Enter thickness";
			cin>>tk;
			ptr1->setThikness(tk);
			ptr1->display();
			break;
		case 6:  //ellipse
			cout<<"enter a & b:"<<endl;
			cin>>x>>y;
			ptr1=new Ellipse(x,y);
			cout<<"Enter thickness";
			cin>>tk;
			ptr1->setThikness(tk);
			ptr1->display();
			break;
			
	}
	cout<<"want to continue enter 1,else 0:";
	cin>>choice;
}while(choice== 1);
	if(ptr1)
		delete ptr1;
	ptr1=NULL;
	return 0;
	
}
