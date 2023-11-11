#include<iostream>
using namespace std;
#include<string.h>

class String1
{
	int len;
	char *ptr;
	
	public:
          String1(char*);
		  void show();
		  ~String1();	
		  String1(String1 &);	
};

void String1 :: show()
{
	cout<<"Length : "<<len<<endl;
	cout<<"String : "<<ptr<<endl;
}

String1 :: String1(char * sptr)
{
	len=strlen(sptr);
	ptr = new char[len+1];
	strcpy(ptr,sptr);
}

String1 :: ~String1()
{
	cout<<"Delete Destructor"<<endl;
	if(ptr)
	delete [] ptr; //delete operator  gives implicit call to destructor
	ptr=NULL;  //assign NUll to ptr
}
String1::String1(String1& c)
{
	this->len = c.len;
	this->ptr = new char[this->len+1];
	strcpy(this->ptr,c.ptr);
}

int main()
{
	String1 s1("Rahul");
	s1.show();
	{
		String1 s2(s1);//copy constructor
		s2.show();
		s2.~String1();
	}
	s1.show();
}
