//Write a Student class and use it in your program. Store the data of 10 students
// and display the sorted data according to their roll numbers, dates of birth, 
//and total marks.
#include <iostream>
#include <iomanip>
using namespace std;

class Student{
	int rno;
	double m1,m2,m3;
	int dd,mm,yy;
	float avg;
	public:
		void getdata()
		{
			cout<<"Enter data of student"<<endl;
			cout<<"Enter roll no "<<endl;
			cin>>rno;
			cout<<"Enter Marks "<<endl;
			cin>>m1>>m2>>m3;
			cout<<"Enter date of Birth "<<endl;
			cin>>dd>>mm>>yy;
		}
	
		void display(){
			cout <<setfill ('*')<<setw (10)<<endl<<" "; //manipulator used
			cout<<"Student Details are "<<"**********"<<endl;
			cout<<"Roll no is "<<rno<<endl;
			cout<<"Marks ="<<m1<<" "<<m2<<" "<<m3<<endl;
			avg=(float)(m1+m2+m3)/3;
			cout << setprecision(5) <<"Average = "<<avg << '\n'; //manipulator used
			//cout<<"Average = "<<avg<<endl;
			cout<<"Date Of Birth: "<<dd<<"/"<<mm<<"/"<<yy<<endl;
			cout<<endl;			
		}
		int getrollno(){
			return rno;
		}
};
int main(){
	Student s[10],temp;
	
	int n,i;
	cout<<"Enter number of Students"<<endl;
	cin>>n;
	for(i=1;i<=n;i++)
	{
		s[i].getdata();
	}
	for(i=1;i<=n;i++)
	{
		s[i].display();
	}
	cout<<endl;
	cout<<endl;
	cout<<"sort information\n";
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(s[i].getrollno()>s[j].getrollno())
			{
				temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
			
		}
	}
	for(i=1;i<=n;i++)
	{
		s[i].display();
	}
		
}
