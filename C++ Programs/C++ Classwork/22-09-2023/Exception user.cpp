#include<iostream>
using namespace std;
#include <exception>  
class custom:public exception{
	const char* what() const throw(){
		return "Custom";
	}
};
int main(){
	int x=12;
	int y;
	int z;
	cin>>y;
	try{
		if(y==0){
			custom z;
			throw z;
			
		}
		else if(y==2){
			throw 100;
		}
		else{
			z=x/y;
			cout<<z<<endl;
		}
	}
	catch(exception& e){
		cout<<e.what()<<endl;
	}
	catch(...){
		cout<<"General"<<endl;
	}
}
