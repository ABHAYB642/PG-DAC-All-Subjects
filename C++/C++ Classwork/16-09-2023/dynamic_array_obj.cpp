#include <iostream>
using namespace std;
//creation of dynamic array of object
class complex
{
    int real,img;
    public:
      void get()
      {
        cout<<"enter real and img\n"<<endl;
        cin>>real>>img;
      }
      void put()
      {
        cout<<"complex no is"<<endl;
        cout<<real<<"+"<<img<<"i"<<endl;
      }
};
int main()
{
    int n,i;
    cout<<"accept no of objects\n";
    cin>>n;

    complex *ptr=new complex[n];
    for(i=0;i<n;i++)
    {
		ptr[i].get();
    }
    for(i=0;i<n;i++)
    {
        ptr[i].put();
    }
}
