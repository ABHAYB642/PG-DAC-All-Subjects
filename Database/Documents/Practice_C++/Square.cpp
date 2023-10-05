#include "Square.h"

#include <iostream>
using namespace std;

Square::Square(int s)
		{
			side=s;
		}
Square:: display()
		{
			cout<<"Area of square="<< side*side<<" & thickness="<<Shape::getThikness() <<endl;
		}
