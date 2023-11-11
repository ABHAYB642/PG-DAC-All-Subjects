#include<iostream>
using namespace std;

class Date1
{
	int dd,mm,yy;
	char a;
	public:
		void getData()
		{
			cout<<"enter the date ="<<endl;
			cin>>dd>>mm>>yy;
		}
		
		void display()
		{
			cout<<"Date is ="<<dd<<"/"<<mm<<"/"<<yy<<endl;
		}
		
		void setDay(int d)
		{
			dd=d;
		}
		
		void setMonth(int m)
		{
			mm=m;
		}
		
		void setYear(int y)
		{
			yy=y;
		}
		
		int getDay()
		{
			return dd;
		}
		
		int getMonth()
		{
			return mm;
		}
		
		int getYear()
		{
			return yy;
		}

};

int main()
{
	Date1 d1;
	d1.getData();
	d1.display();
	cout<<"size of d1 ="<<sizeof(d1)<<endl;
	
	Date1 d2;
	d2.getData(); 
	d2.display();
	
	d2.setDay(16);
	cout<<"modified date is "<<d2.getDay()<<endl;
	d2.setMonth(8);
	cout<<"modified month is "<<d2.getMonth()<<endl;
    d2.setYear(2008);
    cout<<"modified year is "<<d2.getYear()<<endl;

	d2.display();
	
		
}
