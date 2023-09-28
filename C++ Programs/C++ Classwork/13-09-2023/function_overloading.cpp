#include<iostream>
using namespace std;


//function overloading

void show(int x)
{
	cout<<"char to int value = "<<x<<endl;
}

void show(double y)
{
	cout<<"float to double value - "<<y<<endl;
}

int main()
{
	
	show('A');
	show(5.3f);
}
