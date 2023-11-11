#include<iostream>
using namespace std;
#include <string.h>

class Student
{
	int rno;
	char name[10];
	double fee;
	
	public:
		
	Student()
	{
		cout<<"Enter details of name, rno, fees of student="<<endl;
		cin>>name>>rno>>fee;
		cout<<"Details are ="<<"Name="<<name<<"\t"<<"Roll.no="<<rno<<"\t"<<"fees="<<fee<<endl;
		
	}
	
	
	Student(char[] , int , double );//char*
	
};

	Student :: Student(char a[], int r, double f)//char *n
	{
		strcpy(name,a);
		rno=r;
		fee=f;
		cout<<"Details are ="<<"Name="<<name<<"\t"<<"Roll.no="<<rno<<"\t"<<"fees="<<fee<<endl;
		
	}


int main()
{
	Student s1;
	Student s2("sujit",12,20000);
	Student s3("ak",13,32000);
	
	return 0;	
}
