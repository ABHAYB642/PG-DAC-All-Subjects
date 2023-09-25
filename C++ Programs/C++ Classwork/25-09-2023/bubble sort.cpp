#include <iostream>
using namespace std;

int main()
{
	int a[5];
	int i;
	cout<<"enter array elements \n";
	for(i=0;i<5;i++)
	{
		cin>>a[i];
	}
	cout<<"array elements ara \n";
	for(i=0;i<5;i++)
	{
		cout<<a[i]<<endl;
	}
	
	for(i=0;i<=4;i++)
	  {
	  	for(int j=0;j<=(4-i-1);j++)
	  	{
	  		if (a[j]>a[j+1])
			  {
			    int temp = a[j+1];
			    a[j+1]=a[j];
			    a[j]=temp;
			  }
		}
	  }
	  cout<<"after sorting \n";
	  for(i=0;i<5;i++)
	{
		cout<<a[i]<<endl;
	}
	
}
