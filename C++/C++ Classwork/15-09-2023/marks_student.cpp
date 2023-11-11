#include <iostream>
using namespace std;

int main()
{
    int student;
	int m1,m2,m4,m5,m3;
	float avg;
	
	for (student=1;student<=5;student++)
	{
		cout<<"enter the marks of student"<<endl;
	
		cin>>m1>>m2>>m4>>m5>>m3;	
		
		int sum=m1+m2+m3+m4+m5;
	    avg=(float)sum/5;
	    cout<<"avg is= "<<avg<<endl;
	   		
	}
	return 0;
}
