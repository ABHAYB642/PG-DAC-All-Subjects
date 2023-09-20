//inheritance
#include<iostream>
using namespace std;

class A
{
    public:
      A()
      {
        cout<<"in default of A \n";
      }
      void display()
      {
        cout<<"in display of A class "<<endl;
      }
};
class B : public A
{
    public:
      B()
      {
        cout<<"in default of B \n";
      }
      void display()
      {
        cout<<"in display of B class "<<endl;
      }
};
int main()
{
    B bobj;
    bobj.display();
}

/*in default of A
in default of B
in display of B class*/
