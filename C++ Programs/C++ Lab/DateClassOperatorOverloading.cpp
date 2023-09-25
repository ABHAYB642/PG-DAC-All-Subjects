//Write Date and Time classes that allow you to add, subtract, read and 
//print simple dates in dd/mm/yyyy and time in hh:mm:ss formats. 
//Use function overloading in your program.

#include <iostream>
using namespace std;

class Date1
{
	int day,month,year;
	public:
	  Date1(){
	  	
	  }
	  Date1(int d,int m,int y)
	  {
	  	day=d;
		month=m;
		year=y;	
	  }	
	  friend Date1 operator-(Date1 &,int);
	  //friend void operator+(Date1 &,int);
	  Date1 operator+(int);
	  void display()
	  {
	  	cout<<"Date : "<<day<<"_"<<month<<"_"<<year<<endl;
	  }
};
Date1 Date1:: operator+(int num)
{
	Date1 temp;
	this->day=this->day+num;
	this->month=this->month+2;
	this->year=this->year+3;
	return temp;
}
/*Date1 operator-(Date1 &x,int y)//d1=d1-1;
{
	x.day=x.day-y;
	x.month=x.month-3;
	x.year=x.year-6;
	return x;
	cout<<"Date : "<<x.day<<"_"<<x.month<<"_"<<x.year<<endl;
}*/
/*void operator+(Date1 &x,int y)
{
	x.day=x.day+y;
	x.month=x.month+3;
	x.year=x.year+6;
	cout<<"Date : "<<x.day<<"_"<<x.month<<"_"<<x.year<<endl;
}*/
int main()
{
	int dd,mm,yy;
	cout<<"Enter day : ";
	cin>>dd;
	cout<<"Enter month : ";
	cin>>mm;
	cout<<"Enter year : ";
	cin>>yy;
	
/*	Date1 d1(dd,mm,yy);
	d1=d1-1; //d1=operator-(date1,int)//
	d1.display();*/ //OK
	
	
/*	Date1 d1(dd,mm,yy);
	Date1 d2=d1+5;//d2=d1.operator(int)
	d2.display();*/
	
} 
