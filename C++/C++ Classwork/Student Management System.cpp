
//create a menu driven code for Student(name,contact given) management with
//1 to add new student 2.edit student 3.search student
//on adding system roll numbers is auto generated and student gets update
//in option 2 and 3 one must ask rollno search it and when 
//found do needed operation 
//use 1 class 2 array of objects 3 function that return values 4 menu driven system
#include <iostream>
using namespace std;
class Student
{
	
    private:
		string name,contact;
		int rollno;
		
	public:
		static int rollgenerator;
		void setData(string n,string c)
		{
			name=n;
			contact=c;
			rollno=++rollgenerator;
			cout<<"\nCongrats you are registred and your roll no is:"<<rollno;
			
		}
		void editData(string n,string c)
		{
			name=n;
			contact=c;
			cout<<"\nCongrats record updated:";
			displayStudent();
			
		}
		int getRollno()
		{
			return rollno;
		}
		void displayStudent()
		{
			cout<<"\nRoll no:"<<rollno<<"\tName:"<<name<<"\tContact:"<<contact;
		}
};
 
int Student::rollgenerator=202300;
//static declaration outside class is must as global access

int main()
{
	int ch,index=0,flag;
	string name,contact;
	Student student_array[100];
	do
	{
		cout<<"\n1.Add student\n2.Edit student data\n3.Search for student\n4.List All\n0.Exit\n:";
		cin>>ch;
		switch(ch)
		{
			case 1:
				cout<<"\nEnter you name:";
				cin>>name;
				cout<<"\nEnter contact detail:";
				cin>>contact;
				student_array[index].setData(name,contact);
				index++;
				break;
			case 2:
				flag=0;//not found
				int rn;
				cout<<"\nEnter roll no to search:";
				cin>>rn;
				for(int i=0;i<index;i++)
				 {
				 	 if(rn==student_array[i].getRollno())
				 	  {
				 	  	   flag=1;//found
						   cout<<"\nstudent data found\n";
						   student_array[i].displayStudent();
						   cout<<"\nEnter new data:\n";
				           cout<<"\nEnter you name:";
				           cin>>name;
				           cout<<"\nEnter contact detail:";
				           cin>>contact;
				           student_array[i].editData(name,contact);
				           break;
					   }
				 }
				 if(flag==0)
				 	cout<<"\nRoll no:"<<rn<<"Not found";
				break;
			case 3:
					flag=0;//not found
					cout<<"\nEnter roll no to search:";
				    cin>>rn;
				    for(int i=0;i<index;i++)
				      {
				 	   if(rn==student_array[i].getRollno())
				 	    {
				 	  	   flag=1;//found
						   cout<<"\nstudent data found\n";
						   student_array[i].displayStudent();
						   break;
				    	}
				       }
					if(flag==0)
				 		cout<<"\nRoll no:"<<rn<<"Not found";
				 	break;
				 	
			case 0:
					cout<<"\nExiting code";
					break;
			case 4:
				    for(int i=0;i<index;i++)
				    {
				      student_array[i].displayStudent();
					}
				    break;
			default:
					cout<<"\nWrong Choice";
					break;
		}
	}while(ch!=0);
	return 0;
}
