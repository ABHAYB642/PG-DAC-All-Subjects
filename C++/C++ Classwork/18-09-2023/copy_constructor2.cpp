#include<iostream>
using namespace std;

class date
{
	int dd,mm,yy;
	public:
		void show();
		date(int,int,int);
		date(date &);
};
void date::show()
{
	cout<<"Date is "<<dd<<"/"<<mm<<"/"<<yy<<endl;
}
date::date(int d,int m,int y)
{
	dd=d;
	mm=m;
	yy=y;
}
date::date(date &d_new)//user defined copy constructor implementation customized
{
	this->dd=d_new.dd;
	this->mm=d_new.mm;
	this->yy=18;
	
}

int main()
{
	date d(8,8,17);
	date d1(d);//
	d.show();
	d1.show();
}
