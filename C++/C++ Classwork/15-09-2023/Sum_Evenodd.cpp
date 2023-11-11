#include<iostream>
using namespace std;
//Sum of odd and even
int main(){
	int sum=0;
	int sum1;
	int sum2;
	for(int i=1;i<=20;i++)
	{
		if(i%2==0)
		{
			sum1=sum1+i;
			
		}
		
		else
		{
			sum2=sum2+i;
		}
	
		  	
   }
   	cout<<"Sum of even no "<<sum1<<endl;
		cout<<"Sum of odd no "<<sum2<<endl;
   		 
}
