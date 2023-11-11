#include<iostream>
using namespace std;
class temp{
	int x;
	public:
		void get();
		void show();
		friend void manipulate(temp &);
};
void temp::show(){
	cout<<"Value of X"<<x<<endl;
}
void temp::get(){
	cout<<"Accept value of X "<<endl;
	cin>>x;
}
void manipulate(temp &t){
	cout<<"In friend function"<<endl;
	t.x=t.x+5;
}
int main(){
	temp t;
	t.get();
	manipulate(t);
	t.show();
}
