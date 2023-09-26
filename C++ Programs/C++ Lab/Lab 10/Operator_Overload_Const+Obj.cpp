#include<iostream>
using namespace std;
class complex{
	int img,real;
	public:
	complex()
	{
		
	}
	complex(int r,int i){
		this->real=r;
		this->img=i;
	}
	void display(){
		if(img>0)
		cout<<"complex number is "<<real<<"+"<<img<<"i"<<endl;
		else
		cout<<"complex number is "<<real<<img<<"i"<<endl;

	}
	complex operator+(int num)
	{
		complex temp;
		temp.real=this->real+num;
		temp.img=this->img+num;
		return temp;
		
	}
	friend complex operator+(int,complex&);	
};
complex operator+(int num,complex& c)
{
		complex temp;
		temp.real=c.real+num;
		temp.img=c.img+num;
		return temp;
}
int main(){
	complex c1(1,2);
	complex c2=c1+5;//c2=c1.operator+(int)
	c2.display();
	
	complex c3(1,2);
	complex c4=5+c3;//  c2=operator+(5,c1)            
	c4.display();
}
