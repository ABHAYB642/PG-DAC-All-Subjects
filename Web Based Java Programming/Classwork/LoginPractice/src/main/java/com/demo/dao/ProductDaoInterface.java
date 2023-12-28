package com.demo.dao;

import com.demo.beans.User;

public interface ProductDaoInterface {

	User validateuser(String uname, String pass);

	boolean updatepass(String uname, String pass);

}
