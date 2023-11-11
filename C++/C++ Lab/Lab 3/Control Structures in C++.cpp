//Implement all control structures through your program

#include<iostream>
using namespace std;
int main()
{ 
cout<<"IF"<<endl;
int x = 5;  
if (x == 5) {  
    cout << "x is 5" << endl;  
}  

cout<<"IF ELSE"<<endl;
int a=12;
if(a>10){
	cout<<"A is greater than 10"<<endl;	
}
else{
	cout<<"A is less than 10"<<endl;
}

cout<<"SWITCH"<<endl;
int b;
cout<<"Enter choice for switch"<<endl;
cin>>b;
switch (b) {  
    case 1:  
        cout<<"HI"<<endl;
        break;  
    case 2:  
        cout<<"WORLD"<<endl; 
        break;    
    default:  
        cout<<"INVALID"<<endl;
} 

cout<<"FOR"<<endl;
int no;
    cout<<"enter the no. :";
    cin>>no;
    
    for(int i=1;i<=10;i++)
    {
    	cout<<no<<" * "<<i<<" = "<<no*i<<endl;
	}
	
cout<<"WHILE"<<endl;
int j=0;
while(j<5){
	cout<<"CDAC"<<endl;
	j++;	
}

cout<<"DO WHILE"<<endl;
int z = 0;  
do {  
    cout << z << endl;  
    z++;  
} while (z < 5); 
}

