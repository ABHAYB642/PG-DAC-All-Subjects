#include <iostream>

using namespace std;
 
int main() {
 
    char *s1,*s2;
 
    // Inputting 2 strings from user
    cout<<"Enter 1st string: ";
    cin>>s1;
    s1=new char[10];
    
    cout<<"Enter 2nd string: ";
    cin>>s2;
    s2=new char[10];
 
    // Moving till the end of str1
    while(*(++s1));
 
    // Coping str2 to str1
    while(*(s1++) = *(s2++));
 
    cout<<"Concatenated string:"<<s1;
 
    return 0;
 
}
