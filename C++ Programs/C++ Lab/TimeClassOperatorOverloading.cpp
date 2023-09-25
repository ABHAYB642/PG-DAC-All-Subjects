#include<iostream>
using namespace std;
class time
{
	int hr,min,sec;
	public:
		time()
		{
			
		}
		time(int h,int m,int s)
		{
			hr=h;
			min=m;
			sec=s;
		}
		void display()
             {
                  cout<<"time:"<<hr<<":"<<min<<":"<<sec<<endl;
             }
		time operator-(int y);
};
time time::operator-(int y)
{
	time temp;
	this->hr=this->hr-y;
	this->min=this->min-y;
	this->sec=this->sec-y;
	return temp;
}
int main()
{
	int hr,min,sec;
	cout<<"Enter hr:";
    cin>>hr;
    cout<<"Enter Min:";
    cin>>min;
    cout<<"Enter sec:";
    cin>>sec;
    
    time t1(hr,min,sec);
    time t2=t1-1;//t.operator-(int)
    t2.display();
    
    return 0;
}
