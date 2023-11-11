package com.demo.dao;

import java.time.LocalDate;

import com.demo.beans.Question;

public interface ExamDao {

	void javatest(int id, String name, String topic, LocalDate ldt, Question[] ques);

	void htmltest(int id, String name, String topic, LocalDate ldt, Question[] ques);

}
