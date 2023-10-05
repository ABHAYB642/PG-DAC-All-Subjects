#include "Rectangle.h"

#include <iostream>
using namespace std;


Rectangle::Rectangle(int l,int b)
		{
			length=l;
			breadth=b;
		}
Rectangle:: display()
		{
			cout<<"Area of rectangle="<< length*breadth<<" & thickness="<<Shape::getThikness() <<endl;
		}
