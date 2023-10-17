#include<iostream>
using namespace std;
int main(){
	int rowcount1=0;
	int rowcount2=0;
	int rowcount3=0;
	int a[4][3]={0,1,0,1,0,1,1,1,0,1,0,0};
    for(int i=0;i<4;i++)
					{
						         	 for(int k=0;k<3;k++)
			                         {
			                         	if(i%2==0)
			                        
			                         	{
										 if(a[i][k]==1){
										 	rowcount1++;
									}
								}
			}
	cout<<rowcount1;
}}

