/*Create bank management with menu driven:
1.open account:take name and balance of 2000+ and generates account number.
2.deposite: takes amount generate error on either amount being -ve update balance
3.withdraw:take amount generate error if balance goes lesser than 1000 else update.
for option 2/3 one must provide account number,if found do needed tasks.*/
#include<iostream>
using namespace std;
class Bank
{
	private:
		int acno;
		float bal;
		string name;
	public:
		static int acnogenerator;
		void setdata(string n,float amt)
		{
			name=n;
			bal=amt;
			acno=++acnogenerator;
			cout<<"\nCongrats...!!! your Account is created & your account number:"<<acno;
		}
		void displayinfo()
		{
			cout<<"\n acno:"<<acno<<"\tName:"<<name<<"\tBalance:"<<bal;
		}
		int getacno()
		{
			return acno;
		}
			void editData(float c)
		{
			
			bal=bal+c;
			cout<<"\nCongrats amt deposited...:";
			displayinfo();
		}
		float getbal()
		{
			return bal;
		}
		void  WithdrawData(float amt)
		{
			bal=bal-amt;
			cout<<"\nCongrats amt withdrawn successfully...:";
			displayinfo();
	}
};
int Bank::acnogenerator=1000;
main()
{
	int i=0,flag,ch,ac,index;
	float amt;
	string name;
	Bank obj[10];
	do
	{
		cout<<"\n1.Open account\n2.Deposite\n3.Withdraw\n4.List All\n0.Exit\n";
		cout<<"\nEnter your choice:";
		cin>>ch;
		switch(ch)
		{
			case 1: cout<<"\nEnter name:";
					cin>>name;
					cout<<"\nEnter amount:";
					cin>>amt;
					if(amt>2000)
					{
						obj[index].setdata(name,amt);
						index++;	
					}	
					else
						cout<<"Enter Valid amount or more than 2000\n";
					break;	
							
							
			case 2:
						flag=0;
						cout<<"Enter account number";
						cin>>ac;
						for(i=0;i<index;i++)
						{
							if(ac==obj[i].getacno())
							{
							
								flag=1;
						    	cout<<"\n Account found\n";
						    	obj[i].displayinfo();
						   		cout<<"\nEnter new amout to deposite:\n";
				           	
				           		cin>>amt;
				           		if(amt>0)
				          		 {
				           			obj[i].editData(amt);
						   		}
				          	 else
				           	{
				           		cout<<"Err...!!!Enter valid amount:\n";
						   	}
				           
				           break;
					   }
				 }
				 if(flag==0)
				 	cout<<"\nacc no:"<<ac<<"Not found";
				break;
				
				case 3:	flag=0;//not found
						cout<<"\nEnter acc no to search:";
				   	 	cin>>ac;
				    	for(int i=0;i<index;i++)
				      	{
				 	   		if(ac==obj[i].getacno())
				 	   		{
				 	   			flag=1;//found
						   		cout<<"\nacc data found\n";
						   		obj[i].displayinfo();
						   		cout<<"\nEnter withdrawl amt:\n";
						   		cin>>amt;
						   		if(obj[i].getbal()-amt>1000)
				           		{
				           	 		obj[i].WithdrawData(amt);
						   		}
						    	else
				           		{
				           			cout<<"low balance cant withdraw ";
						   		}
						   		break;
						   }
						   
				}
					if(flag==0)
				 		cout<<"\nAcc no:"<<ac<<"Not found";
				 	break;
				 		case 0:
					cout<<"\nExiting code";
					break;
			case 4:
				    for(int i=0;i<index;i++)
				    {
				      obj[i].displayinfo();
					}
				    break;
			default:
					cout<<"\nWrong Choice";
					break;
		}
}while(ch!=0);

}

