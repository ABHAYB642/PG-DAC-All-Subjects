#include <iostream>
#include <fstream>
using namespace std;
class Employee {
public:
   string Name;
   int Employee_ID;
   int Salary;
};
int main(){
   Employee Emp_1;
   
   Emp_1.Name="Ram";
   Emp_1.Employee_ID=2121;
   Emp_1.Salary=20000;
   //Writing this data to Employee.txt
   ofstream file1;
   file1.open("Employee.txt", ios::app);
   file1.write((char*)&Emp_1,sizeof(Emp_1));
   file1.close();
   //Reading data from Employee.txt
   ifstream file2;
   file2.open("Employee.txt",ios::in);
   file2.read((char*)&Emp_1,sizeof(Emp_1));
   printf("\nName :%s",Emp_1.Name);
   printf("\nEmployee ID :%d",Emp_1.Employee_ID);
   printf("\nSalary :%d",Emp_1.Salary);
   file2.close();
   return 0;
}
