#include<iostream>
using namespace std;

int main()
{
	int num;
	cout<<"Enter number of strings you want to store and display: ";
	cin>>num;
	char* a[5]; //five pointer pointing to 5 strings
	for(int i=0;i<num;i++){
        a[i]=new char[num]; //atatime memry allocating to one string
		cout<<"Enter string "<<i+1<<": ";
		cin>>a[i];
	}
	for(int i=0;i<num;i++)
	{
		cout<<a[i]<<endl;
	}
}
