#include <iostream>
using namespace std;
class Test1{
   string str;
   public:
      Test1(string str){
         try{
            if (str == "String"){
               throw "Exception! You cannot use keyword 'String'!";
            }
            else
            {
            	cout<<"String: "<<str;
			}
            this->str = str;   
         }
         catch(const char* s) {
            cout << s << endl;
         }
      }
};

int main() {
   Test1 t("String");
   return 0;
}
