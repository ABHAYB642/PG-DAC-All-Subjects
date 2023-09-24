#include<iostream>
using namespace std;

class MyException: public exception{
	public:
		const char* what() const throw()
		{
			return " Attempted to divide by zero";
		}
};
int main()
{
	int x,y,div;
	cout<<"enter x and y \n";
	cin>>x>>y;
	try
	{
		if(y==0)
		{
			MyException z;
			throw z;
		}
		else{
			div=x/y;
			cout<<div<<endl;
		}
	}
	catch(const char *e)
	{
		cout<<e<<endl;
	}
}
