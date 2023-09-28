#include <iostream>  
using namespace std;  

int main()
{
	int arr[5];
	cout<<"enter array elements \n";
	for(int i=0;i<5;i++)
	{
		cin>>arr[i];
	}
	cout<<"array elements are \n";
	for(int i=0;i<5;i++)
	{
		cout<<arr[i];
		cout<<" ";
	}
	int min=arr[0];
	for(int i=0;i<5;i++)
	{
		if(arr[0]>arr[i])
		min=arr[i];	
	}	
	cout<<"min num in array = "<<min<<endl;
}
