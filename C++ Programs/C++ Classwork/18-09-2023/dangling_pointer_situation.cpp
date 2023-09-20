#include<iostream>
using namespace std;
#include<string.h>

class string1{
	int len;
	char* ptr;
	public:
		string1(char*);
		void stringdisplay();
		~string1();
		
		
}; 
void string1::stringdisplay()
{
	cout<<"length is"<<len<<endl;
	cout<<"String is"<<ptr<<endl;
}
string1::string1(char* sptr)
{
	len = strlen(sptr);
	ptr=new char[len+1];
	strcpy(ptr,sptr);
}
string1::~string1(){
	cout<<"destructor is called"<<endl;
	if(ptr)
	delete []ptr;
	ptr=NULL;
}
int main()
{
	string1 c2("rahul");
	c2.stringdisplay();
	{
		string1 c3(c2);
		c3.stringdisplay();
		c3.~string1();//no need to call explicitly
		
	}
	c2.stringdisplay();
	
}
