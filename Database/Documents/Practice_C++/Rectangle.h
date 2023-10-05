#ifndef RECTANGLE_H
#define RECTANGLE_H

#include "Shape.h"

#include <iostream>
using namespace std;

class Rectangle : public Shape
{
	int length,breadth;
	public:
			Rectangle(int l,int b);
			display();
};

#endif
