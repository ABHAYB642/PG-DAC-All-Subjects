
//op=  5  11  6  12  8  7  9  13  17

#include<iostream>
using namespace std;

int main()
{
	int max[3][3]={
	                5,11,6,
				    7,8,12,
			        9,13,17 };
			int i;
					for(i=0;i<3;i++)
					{
						         	 for(int k=0;k<3;k++)
			                         {
			                         	if(i%2==0)
			                         	{	 
						          	     cout<<" "<<max[i][k]<<" "; 	
						                }
						                 else
				                        {   
					          	          cout<<" "<<max[i][2-k]<<" ";
									    }
						
									 } 
						      	

						  		
						 }                                                 
						 
	return 0;
}
//		        
//						if( i==2)
//						          {
//						         	 for(int k=0;k<3;k++)
//			                         {
//						          	   cout<<" "<<max[i][k]<<" "; 	
//						          	  
//									 } 
//									 				    
//					           	}
							  
					  

