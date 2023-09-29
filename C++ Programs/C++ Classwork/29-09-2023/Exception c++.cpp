#include<iostream>
using namespace std;
int main(){
	int x=12;
	int y;
	cin>>y;
	
	float z;
	try{
		if(y==0){
			throw "Divide by zero";
		}
		else{
			z=x/y;
			cout<<z<<endl;
		}
	}
	catch(const char * e){
		cout<<e<<endl;
	}
	cout<<"End"<<endl;
}
