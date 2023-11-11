#include <iostream>
using namespace std;

//static var

class Complex
{
	int real,img;
	static int cnt;
	
	public:
		Complex()
		{
			cout<<"default is invoked\n";
			real=5;
			img=4;
			cnt++;
		}
	    Complex(int real,int img)
	    {
	    	cout<<"parametrized is invoked\n";
	    	this->real;
	    	this->img;
	    	cnt++;
		}
		static int getcnt(){
			return cnt;
		}
};
int Complex::cnt=0;
int main()
{
	Complex c1;
	Complex c2(10,10);
	
	cout<<"no of objects is"<<Complex::getcnt();
	cout<<"sizeof obj is"<<sizeof(c1)<<endl;
	
	return 0;
}
