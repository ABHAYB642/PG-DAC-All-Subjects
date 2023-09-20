#include<iostream>
using namespace std;

int main()
{
	int fact=1,i,num;
	cout<<"enter num";
	cin>>num;
	for(i=1;i<=num;i++)
	{
	   fact=fact*i;	
	}
	cout<<"Factorial =" <<fact<<endl;
}
