#include<iostream>
using namespace std;
class complex
{
	int real,img;
	public:
		complex(){
			
		}
		complex(int real,int img){
			this->real=real;
			this->img=img;
		}
	void display(){
		if(img>0){
			cout<<"Complex number is "<<real<<"+"<<img<<"i"<<endl;
		}
		else
		cout<<"Complex number is "<<real<<img<<"i"<<endl;
		
	}
	complex operator++()//pre
	{
		++this->real;//this->real=this->real+1
	    ++this->img;
	    return(*this);
	
	}   
	complex operator++(int)//post
	{
		complex temp=(* this);
		++this->real;//this->real=this->real+1
	    ++this->img;
	    return temp;
	
	}
	complex operator--(int)//post decrement
	{
		complex temp=(* this);
		--this->real;//this->real=this->real+1
	    --this->img;
	    return temp;
	
	}
	
};
int main(){
	complex c1(1,2);
	
	cout<<"Pre Increment"<<endl;
	complex c2=++c1;//c2=c1.operator++()
	c1.display();
	c2.display();
	
	complex c3(2,3);
	cout<<"Post Increment"<<endl;
	complex c4=c3++;//c2=c1.operator++(0)
	c3.display();
	c4.display();
	
	complex c5(5,6);
	cout<<"Post Decrement"<<endl;
	complex c6=c5--;//c2=c1.operator(0)
	c5.display(); 
	c6.display();
}
