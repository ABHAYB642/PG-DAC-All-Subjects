#include<iostream>
using namespace std;
template<class X,class Y>

void swap(X& p,Y& q)
{
	int temp;
    temp=p;
    p=q;
    q=temp;
   
}
int main()
{
    float a;
	float b;
    cout<<"enter value of a & b \n";
    cin>>a>>b;
    cout<<"before swapping value of a & b = "<<a<<" "<<b<<endl;
    swap(a,b);
    cout<<"after swapping value of a & b = "<<a<<" "<<b<<endl;
}

