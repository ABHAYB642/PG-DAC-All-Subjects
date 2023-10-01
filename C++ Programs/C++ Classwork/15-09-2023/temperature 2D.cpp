#include<iostream>
using namespace std;

int main()
{
	int city[2][7];
	
	for(int i=0;i<2;i++)
	{
		//for(int j=1;j<=7;j++)
		for(int j=0;j<7;j++)
		{
			cout<<" Enter "<<i+1<<" City "<<j+1<<" Day Temperature : ";
			cin>>city[i][j];
		}
		cout<<endl;
	}
	
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<7;j++)
		{
			cout<<"["<<i+1<<"]"<<" City "<<"["<<j+1<<"]"<<" Day Temperature : "<<city[i][j]<<endl;

		}
		cout<<endl;
	}
	
	
}
