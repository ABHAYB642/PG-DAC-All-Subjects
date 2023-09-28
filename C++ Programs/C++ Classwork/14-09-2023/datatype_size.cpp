#include<iostream>
using namespace std;
void fun();
int main()
{
	fun();
	cout<<"Datatypes"<<"    "<<"size"<<endl;
	fun();
	cout<<"int"<<"          "<<"4"<<endl;
	fun();
}
void fun()
{
	int i;
	while( i<=20)
	{
		cout<<'_';
		i++;
	}
	cout<<endl;
}
