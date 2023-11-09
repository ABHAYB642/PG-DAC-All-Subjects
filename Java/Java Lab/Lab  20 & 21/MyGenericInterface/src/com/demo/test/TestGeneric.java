package com.demo.test;

import com.demo.interfaces.MyGenericInterface;
import com.demo.interfaces.MyInterface;

public class TestGeneric {

	public static void main(String[] args) {
		// return max value
		MyInterface ob=(x,y)->{return(x>y?x:y);};
		System.out.println("max value is "+ob.compare(22, 23));
		
		//for use Integer class 
		MyGenericInterface<Integer> ob1=(x,y)->{return(x>y?x:y);};
		System.out.println("max value is "+ob1.compare(55, 56));
		
		//for compare string 
		MyGenericInterface<String> ob2=(x,y)->
		{
			int ans=x.compareTo(y);
			if(ans>0)
			{
				return x;
			}
			return y;
		};
		System.out.println(ob2.compare("p", "b"));
	}

}
