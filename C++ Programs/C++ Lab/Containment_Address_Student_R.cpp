#include<iostream>
using namespace std;
#include<string.h>

class Address
{
	char area[20];
	char city[20];
    double pincode;
    public:
    	Address()
    	{
    		
		}
		Address(char a[],char c[],double p)
		{
			strcpy(area,a);
			strcpy(city,c);
			this->pincode=p;
		}
		void display()
		{
			cout<<"Area : "<<area<<"\n city : "<<city<<"\n pincode : "<<pincode<<endl;
			
		}
};
class student
{
	int rno;
	int marks[5];
	
	Address add;
	
	public:
		student()
		{
		
		}
		student(int,int[],char[],char[],double);
		void display();
		float avg();
};
student::student(int r,int marks[],char a[],char c[],double p):add(a,c,p)
{
	cout<<"in student constructor \n";
	this->rno=r;
	for(int i=0;i<5;i++)
	{
		this->marks[i]=marks[i];
	}
}
float student::avg(){
	int sum = 0;
	float average;
		for(int i =0; i< 5;i++)
		{
			sum = sum + this->marks[i];
		}
		return average=(float)sum/5;
}
void student::display(){
	cout<<"Data OF student \n";
	cout<<"Roll no. : "<<rno<<endl;
	cout<<"marks are \n";
    for(int i =0; i<5;i++)
	{
		cout<<" Marks :"<<marks[i];
	}
	cout<<endl;
	cout<<"\n Average ="<<avg()<<endl;
		
	add.display();
	cout<<"***********************************\n";
}
int main()
{
	//student s1(1,45,56,46,"a1colony","pune",422014);
	//s1.display();
	int rno,marks[5],n;
	char area[30],city[30];
	double pin;
	
	cout<<"Enter no of student : ";
	cin>>n;
	
	student *s = new student[20]; //student s[20];
	//student s[n];
	cout<<"enter student data \n";
	for(int i = 0; i<n ; i++)
	{
	  cout<<"enter student roll no: \n";
	  cin>>rno;
	  cout<<"enter marks for 5 subject \n";
	  for(int k=0;k<5;k++)
	  {
		cin>>marks[k];
	  }
	  cout<<"enter area : \n";
	  cin>>area;
	  cout<<"enter Pincode : \n";
	  cin>>pin;
	  cout<<"enter city : \n";
	  cin>>city;
	  s[i] = student(rno,marks,area,city,pin);//s[i].getdata()
	}
	
	for(int j=0;j<n;j++){
		s[j].display();
	}

	
	return 0;
	
}
