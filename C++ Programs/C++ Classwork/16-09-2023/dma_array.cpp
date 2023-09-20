#include<iostream>
using namespace std;

//new 
int main()
{   
    int n;
    cout<<"enter  no of array elements"<<endl;
    cin>>n;
	int *ptr = new int[n];//dma to array
	cout<<"enter array elements"<<endl;
	for(int i=0;i<n;i++)
	{
		cin>>ptr[i];
	}
	for(int i=0;i<n;i++)
	{
		cout<<ptr[i];
	}
	
	delete []ptr;
	
}

