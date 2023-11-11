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
		virtual int findSalary()=0; //pure virtual function
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
/*int Employee::findSalary()
{
	cout<<"employee - 10000"<<endl;
}
*/

class wageEmployee : public Employee //derived
{
	int hrs,rate;
	
	public:
		wageEmployee();
		wageEmployee(int,int,int);
		virtual int findSalary();
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
	/* no function defn findSalary() in employee class no virtual member function
	but stil i want to invoke function findSalary() for wageEmployee ==error
	Employee *ptr = new wageEmployee;
	ptr->findSalary(); 
	*/
	
	/*Employee *ptr = new wageEmployee;
	ptr->findSalary();
	
	no function findSalary() in employee class and I am declaring now
	virtual findSalary() in wageEmployee() class still error
	*/
	Employee *ptr = new wageEmployee(10,2000,500);
	ptr->findSalary();
	cout<<"wageEmp salary \n"<<ptr->findSalary()<<endl;
	//Without providing fun defn in emp class using pure virtual fun
	//we can invoke  findSalary() fun for wageEmployee class
	
	
	
}
