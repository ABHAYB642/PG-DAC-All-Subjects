package com.demo.dao;

import java.time.LocalDate;
import java.util.Scanner;

import com.demo.beans.Question;

public class ExamDaoImpl implements ExamDao {

	@Override
	public void javatest(int id, String name, String topic, LocalDate ldt, Question[] ques) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Welcome..!");
		for (int i = 0; i < ques.length; i++)// 3 1 2 3 2
		{

			System.out.print(ques[i].getQno());
			System.out.print(". " + ques[i].getQuestion() + "\n");
			System.out.println("1. " + ques[i].getOpt1());
			System.out.println("2. " + ques[i].getOpt2());
			System.out.println("3. " + ques[i].getOpt3());
			System.out.println("4. " + ques[i].getOpt4());

			System.out.println("Type answer : ");

			String response = sc.next();

			if (response.equals(ques[i].getAnswer())) {
				System.out.println("Correct answer..");
				count++;
			} else {
				System.out.println("Wrong answer..");
			}

			System.out.println("count : " + count);

		}
		if (count >= 3) {
			System.out.println("congratulations you completed the test");
		} else {
			System.out.println("Better luck next time");
		}
	}

	@Override
	public void htmltest(int id, String name, String topic, LocalDate ldt, Question[] ques) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Welcome..!");
		for (int i = 0; i < ques.length; i++)// 3 1 2 3 2
		{

			System.out.print(ques[i].getQno());
			System.out.print(". " + ques[i].getQuestion() + "\n");
			System.out.println("1. " + ques[i].getOpt1());
			System.out.println("2. " + ques[i].getOpt2());
			System.out.println("3. " + ques[i].getOpt3());
			System.out.println("4. " + ques[i].getOpt4());

			System.out.println("Type answer : ");

			String response = sc.next();

			if (response.equals(ques[i].getAnswer())) {
				System.out.println("Correct answer..");
				count++;
			} else {
				System.out.println("Wrong answer..");
			}

		}
		System.out.println("count : " + count);
		if (count >= 3) {
			System.out.println("congratulations you completed the test");
		} else {
			System.out.println("Better luck next time");
		}

	}

}