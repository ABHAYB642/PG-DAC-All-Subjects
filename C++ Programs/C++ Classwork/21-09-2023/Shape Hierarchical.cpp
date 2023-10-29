#include<iostream>
using namespace std;
class shape{
	public:
	virtual int area(){
		return 0;
	}
   virtual void display(){
		cout<<"Area ofshape : "<<endl;
	}
};
class square:public shape{
	int side;
	public:
		square(int s){
			side=s;
		}
		int area(){
			return side*side;
		}
		void display(){
			
			cout<<"Side of square : "<<side<<endl;
		}
		
};
class rectangle:public shape{
	int len,breadth;
	public:
		rectangle(int l,int b){
			len=l;
			breadth=b;
		}
		int area(){
			return len*breadth;
		}
		void display(){
			//square::display();
			cout<<"Length is:"<<len<<"   Breath is : "<<breadth<<endl;
		}
};
int main(){
	shape *sptr=new shape();
	
	sptr=new square(5);
	//cout<<sptr->display()<<endl;
	cout<<"\nArea of Square : "<<sptr->area()<<endl;
	
    sptr=new rectangle(5,10);
    //cout<<sptr->display()<<endl;
	cout<<"\nArea of Rectangle : "<<sptr->area()<<endl;
	
	
}