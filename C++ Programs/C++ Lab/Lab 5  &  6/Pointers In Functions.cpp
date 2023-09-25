#include<iostream>
using namespace std;

void area(int*,int*,int*);
int main()
{
    int l,b,a;
    cout<<"enter length and breadth"<<endl;
    cin>>l>>b;
    area(&l,&b,&a);
    cout<<"area of rectangle is "<<a<<endl;
}
void area(int *p,int *q,int *a)
{
    *a=*p**q;
}
