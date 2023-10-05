#include "Point.h"

#include <iostream>
using namespace std;

Point::Point(int xx,int yy)
		{
			x=xx;
			y=yy;
		}
Point::display()
		{
			cout<<"point is x="<<x<<" & y="<<y<<" & thickness="<<Shape::getThikness()<<endl;
		}
