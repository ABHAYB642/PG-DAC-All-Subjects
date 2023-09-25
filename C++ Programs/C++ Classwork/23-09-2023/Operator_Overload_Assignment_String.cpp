#include<iostream>
using namespace std;
#include<string.h>
class string1
{
	int len;
	char* ptr;
	
	public:
		string1(char *sptr)
		{
			len=strlen(sptr);
			ptr=new char[len+1];
			strcpy(ptr,sptr);
			
		}
		void display()
		{
			cout<<"length is "<<len<<endl;
			cout<<"string is "<<ptr<<endl;
		}
		string1 operator=(string1 &s)
		{
			cout<<"assignment is called\n";
			len=s.len;//
			delete[] ptr;
			ptr=new char[len+1];
			strcpy(ptr,s.ptr);
			return (*this);
		}
		
		string1(string1 &c)
		{
			cout<<"Copy is called";
		}
	
};
int main()
{
	string1 s1("abcde");
	string1 s2("xyz");
	
    s2=s1; //s2.operator=s1
	s2.display();
	s1.display();
	
/*	string1 s5=s2; //copy const copmiler
	s5.display();*/
	
}
