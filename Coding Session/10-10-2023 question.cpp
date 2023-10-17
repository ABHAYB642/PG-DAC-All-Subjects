#include<iostream>
using namespace std;
int main()
{
int count=0;
	int a[]={1,5,7,1};
   int len=sizeof(a)/sizeof(a[0]);
	for(int i=0;i<len;i++)
	{
		for(int j=i+1;j<len;j++)
		{
			if(a[i]+a[j]==6)
			{
			cout<<"pair is "<<a[i]<<" "<<a[j]<<endl;
			count++;
		}	
		}		
	}
	cout<<"total pairs are : "<<count<<endl;
}
