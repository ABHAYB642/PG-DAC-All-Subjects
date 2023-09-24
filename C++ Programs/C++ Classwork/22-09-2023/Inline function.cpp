#include <iostream>
using namespace std;
inline int cube(int); //Inline Function
int main(){
	int x;
	cout<<"Accept value of X "<<endl;
	cin>>x;
	//cube(x);
	cout<<"Cube is "<<cube(x)<<endl;
}
inline int cube(int n){
	return n*n*n;
}
