#include<iostream>
using namespace std;
class Outer{
	public:
		int id;
		void display()
		{
			cout<<"Outer "<<id<<endl;
		}
		
	class Inner{
		Outer o1;
		Outer::o1.display();
	};
	
};
int main(){
	cout<<"Inner class \n";
	//Outer::Inner i1;

}
