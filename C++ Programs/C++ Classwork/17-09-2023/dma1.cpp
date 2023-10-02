#include<iostream>
using namespace std;

//new 
int main()
{
	int* ptr = new int (10); //dma to one var
	cout<<*ptr;
    delete ptr;
	
	int *ptr1 = new int;
	*ptr1=20;
	cout<<*ptr1;
	delete ptr1;
}
