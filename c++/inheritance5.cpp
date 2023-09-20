#include <iostream>
using namespace std;

class Employee()
{
    int id;
    public:
        Employee();
        Employee(int);
        void display();
        int findsalary()
        {
            return 0;
        }
};
Employee::Employee()
{
    cout<<"in default of emp\n";
    id=0;
}
Employee::Employee(int)
{
    cout<<"in para of emp\n";
    id = i;
}
void Employee::display()
{
    cout<<"id = "<<id<<endl;
}

class wageemployee:public Employee
{
    int hrs,rate;
    public:
        wageemployee();
        wageemployee(int,int,int);
        void display();
        int findsalary();
};
wageemployee::wageemployee()
{
    cout<<"in default of wageemployee \n";
    hrs=0;
    rate=0;
} 
wageemployee::wageemployee(int i,int h,int r):Employee(i)
{
    cout<<"in para of wageemployee\n";
    hrs=h;
    rate=r;
}
int wageemployee::findsalary()
{
    return hrs*rate;
}
void wageemployee::display()
{
    Employee::display();
    cout<<hrs<<endl;
    cout<<rate<<endl;
}
class salesmanager:public wageemployee
{
    int sales,comm;
    public:
      salesmanager();
      salesmanager(int,int,int,int,int);
      void display();
      int findsalary();
};
salesmanager::salesmanager()
{
    cout<<"in default of sales\n";
    sales=comm=0;
}
salesmanager::salesmanager(int i,int h,int r,int s,int c):wageemployee(i,h,r)
{
    cout<<"in para of sales\n";
    sales=s;
    comm=c;
}
void salesmanager::display()
{
    wageemployee::display();
    cout<<"sales of emp "<<sales<<endl;
    cout<<"comm of emp "<<comm<<endl;
}
int salesmanager::findsalary()
{
    return (wageemployee::findsalary())+sales*comm;
}
int main()
{
    salesmanager *sm = new salesmanager(101,10,500,2000,1);

    sm->display();
    cout<<"salary is "<<sm->findsalary();
}