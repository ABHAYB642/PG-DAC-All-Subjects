#include <iostream>
using namespace std;

int main() {
    int num, originalNum, remainder, result = 0;
    static int cnt=0;
    //cout << "Enter a three-digit integer: ";

    for(int i=0;i<1000;i++)
    {
        originalNum = num;

      while (originalNum != 0)
      {
        // remainder contains the last digit
        remainder = originalNum % 10;
        
        result += remainder * remainder * remainder;
        
        // removing last digit from the orignal number
        originalNum /= 10;
      }

      if (result == num)
      {
        cout << num << " is an Armstrong number.";
        cnt++;
        
      }
        
      //else
       // cout << num << " is not an Armstrong number.";
    }
    cout<<"count is"<<cnt<<endl;
    

    return 0;
}