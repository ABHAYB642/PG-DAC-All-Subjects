#include<iostream>  
#include<vector>  
#include <set>  
    
using namespace std;  
int main()  
{  
    vector<string> vec;  
   
	vec.push_back("Abhay");  
	vec.push_back("Sujit");  

	for(vector<string>::iterator itr=vec.begin();itr!=vec.end();++itr)  
	
	cout<<*itr;  
	

     
	return 0;   
} 
