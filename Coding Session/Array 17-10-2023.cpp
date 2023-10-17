#include<iostream>
using namespace std;
int main()
{
	int arr[20]={12,13,45,23,10,20,0};
	int i;
	int max=0;
	for(int i=0;i<8;i++){
		if(arr[i]>max){
			max=arr[i];
		}
	}

	for(int j=0;j<8;j++){
		if(arr[j]==max){
			cout<<j+1<<endl;
		}
	}
	cout<<max<<endl;
}
