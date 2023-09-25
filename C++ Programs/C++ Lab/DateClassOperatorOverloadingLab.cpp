#include<iostream>
using namespace std;
class Date1
{
      int day;
      int month;
      int year;
      public:
             Date1(int d,int m,int y)
             {
                   day=d;
                   month=m;
                   year=y;
             }
             
             friend void operator-(Date1 &,int);
             friend void operator+(Date1 &,int);
             //Date1 operator+(int);
             void display()
             {
                  cout<<"Date:"<<day<<"-"<<month<<"-"<<year<<endl;
             }
};
void operator-(Date1 &x, int y)
{
     x.day= x.day-y;
     x.month=x.month-3;
	 x.year=x.year-6;
     cout<<"Date:"<<x.day<<"/"<<x.month<<"/"<<x.year<<endl;
}
void  operator+(Date1 &x,int y)
{
     x.day= x.day+y;
     x.month=x.month+3;
  	 x.year=x.year+6;
  	 cout<<"Date:"<<x.day<<"/"<<x.month<<"/"<<x.year<<endl;
}
/*Date1 Date1:: operator+(int num)
{
	Date1 temp;
	this->day=this->day+num;
	this->month=this->month+2;
	this->year=this->year+3;
	return temp;
}*/
int main()
{
    int dd,mm,yy;
    cout<<"Enter Day:";
    cin>>dd;
    cout<<"Enter Month:";
    cin>>mm;
    cout<<"Enter Year:";
    cin>>yy;
    
    Date1 d1(dd,mm,yy);
    d1-1;//d1=operator-(date1,int)
   	d1+2;//d1=operator+(date1,int)
   	
   	/*
   	Date1 d1(dd,mm,yy);
	Date1 d2=d1+5;//d2=d1.operator(int)
	d2.display();
   	
   	*/
   
    return 0;
}
