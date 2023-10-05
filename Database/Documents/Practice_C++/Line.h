#ifndef LINE_H
#define LINE_H

#include "Shape.h"

class Line : public Shape
{
	int start,end;
	public:
		Line(int s,int e);
		display();
};

#endif
