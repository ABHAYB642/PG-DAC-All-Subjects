#include <iostream>
using namespace std;
class Student{
	int rno;
	double m1,m2;
	public:
		Student(int r,int m1,int m2){
			this->rno=r;
			this->m1=m1;
			this->m2=m2;
		}
		void getdata(){
			cout<<"Enter Data"<<endl;
			cin>>rno>>m1>>m2;
		}
		int getRollno(){
			return rno;
		}
		int getm1(){
			return m1;
		}
		int getm2(){
			return m2;
		}
};
class Sport{
	int sm;
	public:
		Sport(int sm){
			this->sm=sm;
		}
		int getsm1(){
			return sm;
		}
		void getsm(){
			cout<<"Enter Sports Marks"<<endl;
			cin>>sm;
		}
};
class Result:public Student,public Sport
{
	double total,avg;
	public:
		Result(int rno,int m1,int m2,int sm):Student(rno,m1,m2),Sport(sm)
		{
			total=m1+m2+sm;
			avg=total/3;
			
		}
		void display(){
		 	cout<<"Roll No "<<getRollno()<<endl;
		 	cout<<"Marks 1 "<<getm1()<<endl;
		 	cout<<"Marks 2 "<<getm2()<<endl;
		 	cout<<"Sports Marks "<<getsm1()<<endl;
			cout<<" Average is "<<avg<<endl;
			
		}
};
int main()
{
	Result R(1,30,35,40);
	R.display();
}
