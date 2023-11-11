#include <iostream>
using namespace std;

int main()
{
	int ptr1[5];
	int *ptr2[5]; //int array of pointer decln
	
	cout<<"Enter five numbers="<<endl;
	for(int i=0;i<5;i++)
	{
		cin>>ptr1[i];
	}
	for(int i=0;i<5;i++)
	{
		ptr2[i] = &ptr1[i];
	}
	cout<<"Values are = "<<endl;
	for(int i=0;i<5;i++)
	{
		cout<<*ptr2[i]<<endl;
	}
	
	cout<<"size of ptr1="<<sizeof(ptr1)<<endl;
	cout<<"size of ptr2="<<sizeof(ptr2)<<endl;
	cout<<"size of ptr1[1]"<<sizeof(ptr1[1])<<endl;
	cout<<"size of ptr2[1]"<<sizeof(ptr2[1])<<endl;
}
