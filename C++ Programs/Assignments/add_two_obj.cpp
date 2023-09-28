//addn of two objects

#include <iostream>
using namespace std;

class temp
{
    int a;
    public:
    void get();
    void show()
    {
        cout<<"value is "<<a<<endl;
    }
    temp add(temp &b1)//ref //return type class name
    {
        temp aobj3;//object creation also possible here
        aobj3.a=this->a+b1.a;
        return aobj3;
    }
};
void temp::get()
{
    cout<<"enter the value\n";
    cin>>this->a;
}

int main()
{
    temp aobj1,aobj2;
    aobj1.get();
    aobj2.get();
    temp aobj4=aobj1.add(aobj2);
    aobj4.show();



    return 0;
}
