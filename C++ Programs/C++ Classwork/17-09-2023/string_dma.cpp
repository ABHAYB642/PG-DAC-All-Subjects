#include <iostream>
using namespace std;
#include <string.h>
class String1{
	int len;
	char * ptr;//data member
	public:
		String1(char *);//Char[]
		void show();
		String1(char,int);
		String1(int);
		String1();
		
};
void String1 :: show(){
	cout<<"String is "<<ptr<<endl;
	cout<<"length is "<<len<<endl;
}
String1::String1(char * ptr1)//local//case1
{
	len=strlen(ptr1);
	ptr=new char[len+1];//dma
	strcpy(this->ptr,ptr1);
	
}
String1::String1(char ch,int len)//case2
{
	int i;
	this->len = len;
	ptr=new char[this->len+1];//dma
	for(i=0;i<this->len;i++)
	{
		ptr[i]=ch;
		cout<<ptr[i];
	}
	ptr[i]='\0';
	
}
String1::String1(int len)//case3
{
	this->len=len;
	ptr=new char[this->len+1];//dma
	char ch[this->len+1];
	cout<<"\n enter String \n";
	cin>>ch;
	strcpy(ptr,ch);
	
}
String1::String1()//case4
{
	int len;
	cout<<"\n enter length \n";
	cin>>len;
	char ptr1[len+1];
	this->len=len;
	ptr=new char[this->len+1];//dma
	cout<<"\n enter string \n ";
	cin>>ptr1;
	strcpy(ptr,ptr1);
}

int main(){
	String1 s1("CDAC");
	s1.show();
	String1 s2('*',50);
	String1 s3(5);
	s3.show();
	String1 s4;
	s4.show();
	
	
}
