package com.demo.service;

import com.demo.beans.User;

public interface ProductServiceInterface {

	User validateUser(String uname, String pass);

	boolean updatepass(String uname, String pass);

}
