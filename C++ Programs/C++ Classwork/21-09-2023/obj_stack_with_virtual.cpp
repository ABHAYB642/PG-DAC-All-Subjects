//case3
//case 1
#include<iostream>
using namespace std;

class Employee
{
	int id;
	
	public:
		Employee();
		Employee(int);
		void display();
		virtual int findSalary(); //virtual function
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
	Employee *ptr;
	/*Employee e1;
	ptr=&e1;
	ptr->findSalary();
	*/
	wageEmployee we1(100,2000,500);
	ptr=&we1;
	cout<<"wageEmp salary \n"<<ptr->findSalary()<<endl;
	
	
	salesManager sm1(100,1000,500,2000,100);
	ptr=&sm1;
	cout<<"salesmanager salary \n"<<ptr->findSalary();
	
	
	
}
