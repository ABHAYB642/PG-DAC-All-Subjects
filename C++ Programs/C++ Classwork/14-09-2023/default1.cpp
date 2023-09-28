#include<iostream>
using namespace std;
	
	void display(char='*', int=3);
	
int main()
{
	cout<<"No argument passed"<<endl;
	display();
	
	cout<<"first arg. passed"<<endl;
	display('#');
	
	cout<<"both arg passed"<<endl;
	display('$',5);
	
}


void display(char c, int count)
{
	for(int i=1; i<=count; ++i)
	{
		cout<<c;
		
	}
	cout<<endl;

}
