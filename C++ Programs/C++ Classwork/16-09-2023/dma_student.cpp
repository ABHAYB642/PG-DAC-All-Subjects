//Accept no of subjects and name from user dynamically and 
//accept marks for each subject and display avg and name of student

#include <iostream>
using namespace std;

int main()
{
    int m,n,sum=0;
    float avg;
    cout<<"enter no of subjects\n";
    cin>>m;
    cout<<"enter no of char\n";
    cin>>n;

    int* marks_m=new int [m];
    char* name_n=new char[n+1];

    cout<<"enter marks  "<<endl;
    for(int i=0;i<m;i++)
    {
        cin>>marks_m[i];
        sum=sum+marks_m[i];
    }
    avg=(float)sum/m;
    cout<<"enter name of student"<<endl;
    cin>>name_n;
    cout<<"name is "<<name_n<<endl;
    cout<<"avg is "<<avg;

    delete[] marks_m;
    delete[] name_n;



}
