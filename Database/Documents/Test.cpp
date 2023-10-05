#include<iostream>
using namespace std;

class Test
{
	int x;
	public:
		Test()
		{
			
		}
		Test(int x)
		{
			this->x=x;
		}
		void setValue(int x1)
		{
			x=x1;
		}
	/*	void getData()
		{
			cout<<"enter value of x "<<endl;
			cin>>x;
		}*/
		void dispData()
		{
			cout<<"value of x "<<x<<endl;
		}
};
int main()
{
    int y;
    cout<<"enter value of y "<<endl;
    cin>>y;
	Test t(y);
	t.dispData();	
}
