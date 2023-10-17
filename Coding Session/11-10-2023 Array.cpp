#include<iostream>
using namespace std;
int main(){
	int a[3][3]={5,11,6,7,8,12,9,13,17};
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			cout<<a[i][j];
			cout<<" ";
		}
		cout<<endl;
	}
}
