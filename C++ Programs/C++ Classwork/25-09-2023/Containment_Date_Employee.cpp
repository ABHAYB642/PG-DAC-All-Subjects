#include<iostream>
using namespace std;
class cDate
{
	int mDay,mMonth,mYear;
	public:
		cDate()
		{
			mDay=10;
			mMonth=11;
			mYear=1999;
		}
		cDate(int d,int m,int y)
		{
			cout<<"in date const \n";
			mDay=d;
			mMonth=m;
			mYear=y;
			
		}
		void display()
		{
			cout<<"day "<<mDay<<endl;
			cout<<"month "<<mMonth<<endl;
			cout<<"year "<<mYear<<endl;
		}
};
class Employee
{
	int mid;
	int basicsal;
	cDate mdate;
	public:
		Employee()
		{
			mid=1;
			basicsal=10000;
			mdate=cDate();
		}
		Employee(int,int,int,int,int);
		void display();
};
Employee::Employee(int i,int sal,int d,int m,int y):mdate(d,m,y)
{
	cout<<"in emp constructor \n";
	mid=i;
	basicsal=sal;
}
void Employee::display()
{
	cout<<"Id = "<<mid<<endl;
	cout<<"Salary = "<<basicsal<<endl;
	mdate.display();
}
int main()
{
	Employee c2(2,20000,11,11,1999);
	c2.display();
	return 0;
}
