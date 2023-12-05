package com.demo.service;

import com.demo.beans.Person;

//in interface methods are only declared.Not define
public interface PersonService {

	void addNewPerson();

	Person[] displayAll();

	Person displayById(int pid);

}
