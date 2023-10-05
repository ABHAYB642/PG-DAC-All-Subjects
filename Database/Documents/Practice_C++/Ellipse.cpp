#include "Ellipse.h"
#define PI 3.142

#include <iostream>
using namespace std;


Ellipse::Ellipse(int h,int w)
		{
			height=h;
			width=w;
		}
Ellipse:: display()
		{
			cout<<"Area of Ellipse="<< PI*height*width<<" & thickness="<<Shape::getThikness()  <<endl;
		}
