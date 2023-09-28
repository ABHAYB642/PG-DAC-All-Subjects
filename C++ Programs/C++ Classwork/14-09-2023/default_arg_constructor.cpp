#include<iostream>
using namespace std;

class date
{
	int dd,mm,yy;
	public:
		date(int=15,int=10,int=2024);// default arg -decln
		//date(int,int=10,int=2024);
		void show()
		{
			cout<<dd<<" "<<mm<<" "<<yy<<endl;
		}
};                                                                                    
date::date(int d,int m,int y)
{
	dd=d;
	mm=m;
	yy=y;
	
}
int main()
{
	date d(14,9);
	date d1;
	d.show();
	d1.show();
	return 0;
}
