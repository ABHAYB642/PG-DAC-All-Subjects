#ifndef SHAPE_H
#define SHAPE_H

#include <iostream>
using namespace std;

class Shape
{
	int thickness;
	public:
		virtual display()=0;
		setThikness(int Tk);
		int getThikness();
	
	
};

#endif
