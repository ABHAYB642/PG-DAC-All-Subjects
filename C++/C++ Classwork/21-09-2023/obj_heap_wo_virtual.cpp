//case 2
#include<iostream>
using namespace std;

class Employee
{
	int id;
	
	public:
		Employee();
		Employee(int);
		void display();
		int findSalary();
};

Employee :: Employee()
{
	cout<<"Inside Employee Default Constructor"<<endl;
}

Employee :: Employee(int i)
{
	cout<<"Inside Employee Parameterised Constructor "<<endl;
	id=i;
}
void Employee::display() 
{
	cout<<"Employee ID is : "<<id<<endl;
}
int Employee::findSalary()
{
	cout<<"employee - 10000"<<endl;
}

class wageEmployee : public Employee //derived
{
	int hrs,rate;
	
	public:
		wageEmployee();
		wageEmployee(int,int,int);
		int findSalary();
		void display();
	
};

wageEmployee::wageEmployee()
{
	cout<<"Inside Wage Employee Default Constructor "<<endl<<endl;
}

wageEmployee::wageEmployee(int id,int hrs,int rate):Employee(id)
{
	cout<<"Inside Wage Employee Para Constructor"<<endl;
	this->hrs=hrs;
	this->rate=rate;

}
int wageEmployee::findSalary()
{
	return hrs * rate;
}
void wageEmployee::display() 
{
	Employee::display();
	cout<<"HRS are "<<hrs<<endl;
	cout<<" Rate is "<<rate<<endl;
}

class salesManager:public wageEmployee //multilevel
{
	int sales,comm;
	
	public:
		salesManager();
		salesManager(int,int,int,int,int);
		int findSalary();
		void display();
	
};

salesManager :: salesManager()
{
	cout<<"Inside Default constructor of Sales Manager"<<endl;
	sales=0;
	comm=0;
}

salesManager :: salesManager(int id,int hrs,int rate,int sales,int comm): wageEmployee(id,hrs,rate)
{
	cout<<"Inside Paramerterised constructor of Sales Manager"<<endl;
	this->sales=sales;
	this->comm= comm;
}

int salesManager :: findSalary()
{
	return (wageEmployee :: findSalary())+ (sales * comm);
}

void salesManager :: display()
{
	wageEmployee :: display();
	cout<<"SALES of an employee : "<<sales<<endl;
	cout<<"Commission of an employee : "<<comm<<endl;
}

int main()
{
	Employee *ptr = new Employee(1);//heap//generic class pointer ptr of emp class
	ptr->display();//1
	ptr->findSalary();
	
	ptr=new wageEmployee();
	ptr->findSalary();
	
	ptr=new salesManager();
	ptr->findSalary();
	
	
}
