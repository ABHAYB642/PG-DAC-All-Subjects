#include<iostream>
using namespace std;

int main()
{
	int fact=1,i,num;
	cout<<"enter num";
	cin>>num;
	while(i<=num)
	{
	   fact=fact*i;	
	   i++;
	}
	cout<<"Factorial =" <<fact<<endl;
}
