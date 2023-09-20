//Write a Student class and use it in your program. Store the data of 10 students
// and display the sorted data according to their roll numbers, dates of birth, 
//and total marks.
#include <iostream>
using namespace std;

class Student{
	int rno;
	double marks;
	int dd,mm,yy;
	public:
		void getdata()
		{
			cout<<"Enter data of student"<<endl;
			cout<<"Enter roll no "<<endl;
			cin>>rno;
			cout<<"Enter Marks "<<endl;
			cin>>marks;
			cout<<"Enter date of Birth "<<endl;
			cin>>dd>>mm>>yy;
		}
		void display(){
			cout<<"Student Details are "<<endl;
			cout<<"Roll no is "<<rno<<endl;
			cout<<"Marks ="<<rno<<endl;
			cout<<"Date Of Birth: "<<dd<<"/"<<mm<<"/"<<yy<<endl;			
		}
};
int main(){
	Student s[10];
	
	int n,i;
	cout<<"Enter number of Students"<<endl;
	cin>>n;
	for(i=1;i<=n;i++)
	{
		s[i].getdata();
		s[i].display();
	}
	
}
