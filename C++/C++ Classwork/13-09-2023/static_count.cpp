#include<iostream>
using namespace std;


class Static1
{
	
	public :
		
		Static1()
	{
		
	cout<<"final value is="<<fun()<<endl;
	cout<<"final value is="<<fun()<<endl;
	cout<<"final value is="<<fun()<<endl;
	}
	
	Static1(int a) 
	{
	 int y=a;
	cout<<"final value is="<<fun1()<<endl;
	cout<<"final value is="<<fun1()<<endl;
	cout<<"final value is="<<fun1()<<endl;
	}

	int fun();
	int fun1();
};

	int Static1::fun()
{
	static int x=0;
	cout<<"initial value is="<<x<<endl;
	x++;
	 
	return x;
	
}

	int Static1::fun1()
{
	int x=0;
	cout<<"initial value is="<<x<<endl;
	x++;
	return x;
	
}


int main()
{
	cout<<"static="<<endl;
	Static1 s1;


	cout<<"nonstatic="<<endl;
	
	Static1 s2(4);	
	return 0;
}
