#include <iostream>
using namespace std;

int main()
{
    char *str;
    str=new char[10];
    cout<<"enter the string"<<endl;
    cin>>str;
    cout<<"string is "<<str;

    delete[] str;
    return 0;
}
