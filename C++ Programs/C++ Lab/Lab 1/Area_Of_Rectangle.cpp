#include<iostream>
using namespace std;
int area(int,int);
int main()
{
	int length,breadth,a;
	cout<<"Enter length and breadth"<<endl;
	cin>>length>>breadth;
	a=area(length,breadth);
	cout<<"Area is "<<a;
	return 0;
}
int area(int l,int b){
	
	return l*b;
}
