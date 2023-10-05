#include "Circle.h"
#define PI 3.142

#include <iostream>
using namespace std;

Circle::Circle(int r)
		{
			radius=r;
		}
Circle:: display()
		{
			cout<<"Area of Circle="<< (float)PI*radius*radius<<" & thickness=" <<Shape::getThikness() <<endl;
		}
