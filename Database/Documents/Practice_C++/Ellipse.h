#ifndef ELLIPSE_H
#define ELLIPSE_H

#include "Shape.h"

class Ellipse : public Shape
{
	int height,width; 
	public:
			Ellipse(int h,int w);
			display();

};

#endif
