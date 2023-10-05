#include "Line.h"
#include <iostream>
using namespace std;

Line::Line(int s,int e)
		{
			start=s;
			end=e;
		}
Line:: display()
		{
			cout<<"Line starts from ("<<start<<","<<end<<")"<<" & thickness="<<Shape::getThikness()<<endl;
		}
