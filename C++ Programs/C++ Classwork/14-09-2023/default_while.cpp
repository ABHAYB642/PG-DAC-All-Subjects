#include<iostream>
using namespace std;


void line1(char='-');

int main()
{
	line1();
	
	line1('#');
}

void line1(char a)
{
	int i=0;
	cout<<"refer below line"<<endl;
	while( i<=10)
	{
		cout<<a;
		i++;
	}
	cout<<endl;
}


