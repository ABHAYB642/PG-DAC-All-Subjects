#include <iostream>
using namespace std;

class Test{
	int a,b;
	public:
		void show(int a,int b)
		{
			this->a=a;
			(*this).b=b;
		}
		void display()
		{
			cout<<a<<b<<endl;
		}
};
int main()
{
		Test t;
		t.show(10,20);
		t.display();
		Test t1;
		t1.show(30,40);
		t1.display();
		return 0;
}
