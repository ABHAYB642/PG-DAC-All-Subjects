#include <iostream>
using namespace std;
//adding const to an obj
class demo
{
    int a;
    public:
    demo()
    {
        a=5;
    }
    /*int add(int x)
    {
        a=a+x;
        return a;
    }
    */
    int add(int a)
    {
        this->a=this->a+a;
        return this->a;
    }
};
int main()
{
    demo d;
    cout<<"result = "<<" "<<d.add(10);
}