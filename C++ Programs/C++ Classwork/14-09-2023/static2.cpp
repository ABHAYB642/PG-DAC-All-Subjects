#include <iostream>
using namespace std;

//static const var

class Complex
{
	int real,img;
	public: static const int cnt;
	 static const int cnt1;
	
	public:
		Complex()
		{
			cout<<"default is invoked\n";
			real=5;
			img=4;
			//cnt++;
		}
	    Complex(int real,int img)
	    {
	    	cout<<"parametrized is invoked\n";
	    	this->real;
	    	this->img;
	    	//cnt++;
		}
		static int getcnt(){
			return cnt;
		}
		 int getcnt1(){
			return cnt1;
		}
};
const int Complex::cnt=5;
const int Complex::cnt1=10;
int main()
{
	Complex c1;
	//Complex c2(10,10);
	
	cout<<"no of objects is"<<Complex::cnt<<endl;
	cout<<"no of objects is"<<c1.getcnt1()<<endl;
	cout<<"sizeof obj is"<<sizeof(c1)<<endl;
	
	return 0;
}
