#include<iostream>
using namespace std;
#include<string.h>

class student
{
	int rno;
	char* name1;
	double fee;
	public:
		student(int,char*,double);
		student(student &t);
		void display();

};
void student::display()
{
	cout<<"Student roll no is "<<rno<<"name is "<<name1<<"fee is"<<fee<<endl;
}
student::student(int r,char* n,double f) //para
{
	rno=r;
    int len=strlen(n); //
    name1=new char[len+1];//
	strcpy(this->name1,n);
	fee=f;
}
student::student(student &t)//ref //copy constructor
{
	this->rno=t.rno;
    int len=strlen(t.name1); //
    name1=new char[len+1];//
    strcpy(this->name1,t.name1);//imp
	this->fee=t.fee;
}
int main()
{
	student s1(1,"abhay",5000);
	s1.display();
	student s2(s1);//copy
	s2.display();
}
