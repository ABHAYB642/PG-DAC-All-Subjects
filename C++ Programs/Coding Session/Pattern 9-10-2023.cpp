#include <iostream>
using namespace std;
//1st coding session
int main(){
int rows,i,j;
cout<<"Enter the number of rows: ";
cin>>rows;
for(int i=1;i<=rows;i++){
	for(j=1;j<=rows -i;j++){
		cout<<" ";
	}
	for(int k=1;k<=i;k++){
		cout<<"*";
	}
	cout<<i;
	for(int k=1;k<=i;k++){
		cout<<"*";
	}
	cout<<endl;
}
};
