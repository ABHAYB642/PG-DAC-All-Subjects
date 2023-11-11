#include<iostream>
using namespace std;

class Date1
{
	int dd,mm,yy;
	char a;
	public:
		
		Date1()
		{
			cout<<"inside no arg constructor"<<endl;
		    cout<<"enter the date ="<<endl;
			cin>>dd>>mm>>yy;
			
			cout<<"Date is ="<<dd<<"/"<<mm<<"/"<<yy<<endl;
			
			
		}
		Date1(int d,int m,int y)
		{
			dd=d;
			mm=m;
			yy=y;	
			cout<<"Modified Date is ="<<dd<<"/"<<mm<<"/"<<yy<<endl;
		}
		
	
};

int main()
{
	Date1 d1;
	Date1 d2(24,12,2012);
	//d1.getData();
	//d1.display();		
}
