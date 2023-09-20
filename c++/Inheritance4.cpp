//inheritance
#include<iostream>
using namespace std;

class A
{
    int a;
    public:
    A()
    {
        cout<<"in default of A class\n";
    }
    A(int);
    void display();
};
A::A(int p)
{
    cout<<"in para of A \n";
    a=p;
}
void A::display()
{
    cout<<a<<endl;
}
class B:public A
{
    int b;
    public:
        B(int,int);
        void display();

        
};
B::B(int p,int q):A(p)
{
    cout<<"in para of B\n";
    //a=p; not possible bcz a is private attribute
    b=q;
}
void B::display()
{
    A::display();
    cout<<b<<endl;
}
int main()
{
    B bobj(10,20);
    bobj.display();
}