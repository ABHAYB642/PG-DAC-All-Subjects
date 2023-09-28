#include<iostream>
using namespace std;

class Employee
{
	int id,age;
	char a[1];
	
	public:
		void getData()
		{
			cout<<"enter Name,id & age = "<<endl;
			cin>>a>>id>>age;
		}
		
		void display()
		{
			cout<<"name is = "<<a<<endl;
			cout<<"id is = "<<id<<endl;
			cout<<"age is = "<<age<<endl;
		}
	
};

int main()
{
 	Employee e[3];
 	for (int i=0; i<3;i++)
 	{
 		e[i].getData();
	 }
	 
	for (int i=0; i<3;i++)
 	{
 		e[i].display();
	}
 	cout<<"size of objects="<<sizeof(e)<<endl;
	
}

