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
//	for(int i=0;i<5;i++)
//	{
//		cout<<arr[i]; //*(arr+i) // *(ptr+i)
//		cout<<" ";
//	}
//	int max=arr[0];
//	for(int i=0;i<5;i++)
//	{
//		if(arr[0]<arr[i])
//		max=arr[i];	
//	}	
//	cout<<"max num in array = "<<max<<endl;
	
	int *ptr = arr;
	cout<<*ptr<<endl;
	cout<<*arr<<endl;
	
	int *ptr1[5];
	
}
