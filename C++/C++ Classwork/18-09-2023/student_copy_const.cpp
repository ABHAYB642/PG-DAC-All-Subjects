#include<iostream>
using namespace std;
#include<string.h>
class student{
	int rno;
	char name[50];
	double fee;
	public:
		student(int,char*,double);
		student(student &t);
		void display();

};
void student::display(){
	cout<<"Student roll no is "<<rno<<"name is "<<name<<"fee is"<<fee<<endl;
}
student::student(int r,char* n,double f)
{
	rno=r;
	
	strcpy(name,n);
	fee=f;
}
student::student(student &t)//ref
{
	this->rno=t.rno;
	
    strcpy(this->name,t.name);//imp
	this->fee=t.fee;
}
int main()
{
	student s1(1,"abhay",5000);
	s1.display();
	student s2(s1);
	s2.display();
}
