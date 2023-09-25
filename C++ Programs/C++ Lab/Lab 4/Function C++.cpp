#include<iostream>
using namespace std;

void addition(int,int);
void substraction(int,int);
int main()
{
    int num1,num2;
    cout<<"enter num two numbers "<<endl;
    cin>>num1>>num2;

    addition(num1,num2);
    substraction(num1,num2);


    return 0;

}
void addition(int num1,int num2)
{
    cout<<"addition of two numbers is "<<num1+num2<<endl;
}
void substraction(int num1,int num2)

{
    cout<<"substraction of two numbers is "<<num1-num2<<endl;
}
