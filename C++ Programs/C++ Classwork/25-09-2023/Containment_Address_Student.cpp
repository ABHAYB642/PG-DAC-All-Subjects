#include<iostream>
using namespace std;
#include<string.h>

class Address
{
	char area[20];
	char city[20];
    double pincode;
    public:
    	Address()
    	{
    		
		}
		Address(char a[],char c[],double p)
		{
			strcpy(area,a);
			strcpy(city,c);
			this->pincode=p;
		}
		void display()
		{
			cout<<"Area is "<<area<<" city : "<<city<<" pincode : "<<pincode<<endl;
			
		}
};
class student
{
	int rno;
	int m1,m2,m3;
	float avg;
	Address add;
	
	public:
		student()
		{
			rno=1;
			m1=45;
			m2=47;
			m3=46;
			add=Address();
		}
		student(int,int,int,int,char[],char[],double);
		void display();
};
student::student(int r,int m1,int m2,int m3,char a[],char c[],double p):add(a,c,p)
{
	cout<<"in student constructor \n";
	this->rno=rno;
	this->m1=m1;
	this->m2=m2;
	this->m3=m3;
	add=Address();
}
void student::display(){
	avg=(float)(m1+m2+m3)/3;
	cout<<"Roll no. : "<<rno<<" Marks :"<<m1<<" "<<m2<<" "<<m3<<" Average ="<<avg<<endl;
	add.display();
}
int main()
{
	student s1(1,45,56,46,"a1colony","pune",422014);
	s1.display();
	
	return 0;
	
}
