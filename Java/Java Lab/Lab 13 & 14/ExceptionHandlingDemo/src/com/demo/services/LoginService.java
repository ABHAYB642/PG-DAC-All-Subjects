package com.demo.services;

import java.util.Map;
import java.util.HashMap;

public class LoginService {
	
	static Map<String,String> hm;
	static 
	{
	  hm = new HashMap<>();
	  hm.put("user1","user1");
	  hm.put("user2","user2");
	  hm.put("user3","user3");
	  hm.put("user4","user4");
	  hm.put("user5","user5");
	  hm.put("user6","user6");
	}
	
	public static boolean Validateuser(String uname, String pass) {
        String p = hm.get(uname);
        
        if(p!= null)
        {
        	if(p.equals(uname))
        	{
        		return true;
        	}
        }
	 	
		throw new NullPointerException("Credential are wrong...");
	}

}
