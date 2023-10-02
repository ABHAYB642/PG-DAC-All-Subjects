#include<iostream>
using namespace std;
//do while
int main()
{
    int sum=0,num;
    do
    {
        cout<<"enter num "<<endl;
        cin>>num;
        sum=sum+num;

    }while(num!=0);
    cout<<sum<<endl;
}