#include <iostream>
using namespace std;
//creation of dynamic object
class complex
{
    int real,img;
    public:
    complex()
    {
        real=img=5;
    }
    complex(int r,int i)
    {
        real=r;
        img=i;
    }
    void show()
    {
        cout<<real<<"+"<<img<<"i"<<endl;
    }
};
int main()
{
    complex *ptr1 = new complex();
    ptr1->show();
    complex *ptr2 = new complex(10,2);
    ptr2->show();

}