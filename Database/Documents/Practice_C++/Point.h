#ifndef POINT_H
#define POINT_H

#include "Shape.h"

#include <iostream>
using namespace std;

class Point : public Shape
{
	int x,y;
	public:
		Point(int xx,int yy);
		display();
};

#endif
