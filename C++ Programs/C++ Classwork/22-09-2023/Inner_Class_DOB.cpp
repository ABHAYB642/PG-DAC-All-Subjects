#include<iostream>
using namespace std;

class Student
{
	int rollno;
	public:
	//Dob date
	class Dob
	{
		int dd,mm,yy;
		public:
			void get(int d,int m,int y)
			{
				this->dd=d;
				this->mm=m;
				this->yy=y;		
				cout<<"dob = "<<dd<<" "<<mm<<" "<<yy<<endl;
			}
			
	};
};
int main()
{
	Student::Dob d;
	d.get(12,9,2014);
}
