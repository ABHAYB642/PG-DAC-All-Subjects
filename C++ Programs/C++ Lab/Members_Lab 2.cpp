//"	Declare members and implement in your programs.
#include<iostream>
using namespace std;
int funlocal();
int funstatic();
static int count=0;

int main()
{
	cout<<"------------------Local-------------"<<endl;
	cout<<"  final value "<<funlocal()<<endl;
	cout<<"  final value "<<funlocal()<<endl;
	cout<<"  final value "<<funlocal()<<endl;
	cout<<"------------------Static-------------"<<endl;
	cout<<"  final value "<<funstatic()<<endl;
	cout<<"  final value "<<funstatic()<<endl;
	cout<<"  final value "<<funstatic()<<endl;

 	cout<<"Function call no of times :"<<count<<endl;
}
int funlocal()
{
	int x=0;
	cout<<"Initial value of x: "<<x;
	x++;
	
	return x,count++;
}

int funstatic()
{
	static int x=0;
	cout<<"Initial value of x: "<<x;
	x++;
	return x;
}
