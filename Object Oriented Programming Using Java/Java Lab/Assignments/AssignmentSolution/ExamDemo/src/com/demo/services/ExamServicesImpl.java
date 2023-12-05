package com.demo.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.demo.beans.Question;
import com.demo.dao.ExamDao;
import com.demo.dao.ExamDaoImpl;

public class ExamServicesImpl implements ExamServices {

	private ExamDao edao;

	public ExamServicesImpl() {

		edao = new ExamDaoImpl();
	}

//	class Exam, for each exam store examid, name ,topic, date 
//	of exam and array of questions.
//	For each question store qno, question, opt1,opt2,opt3,opt4,ans,marks
//	Create 2 exam objects One for java test and one for Html test by storing 5 questions
	@Override
	public void javaexam() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter examid : ");
		int id = sc.nextInt();

		System.out.println("Enter name of Exam");
		String name = sc.next();

		System.out.println("Enter Topic");
		String topic = sc.next();

		System.out.println("enter date(dd/MM/yyyy)");
		String dt = sc.next();
		LocalDate ldt = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

//		List<String> arr = new ArrayList<>();
//		System.out.println("Enter no of Question");
//		int no = sc.nextInt();
//		for (int i = 0; i < no; i++) {
//			System.out.println("Enter Question no");
//			int qno = sc.nextInt();
//			System.out.println("Enter Question");
//			String que = sc.next();
//			System.out.println("Enter Option 1");
//			String opion1 = sc.next();
//			System.out.println("Enter Option 2");
//			String opion2 = sc.next();
//			System.out.println("Enter Option 3");
//			String opion3 = sc.next();
//			System.out.println("Enter Option 4");
//			String opion4 = sc.next();
//			System.out.println("Enter Answer");
//			String ans = sc.next();
//			System.out.println("Enter marks");
//			int marks = sc.nextInt();
//			Question q = new Question(qno, que, opion1, opion2, opion3, opion4, ans, marks);
//			qarr.add(q);
//        }
//Exam e = new Exam(id, name, topic, ldt, qarr);edao.save(e);

		Question[] ques = new Question[5];
		{
			ques[0] = new Question(1, "Number of primitive data types in Java are?", "6", "7", "8", "9", "8", 1);
			ques[1] = new Question(2, "What is the size of float and double in java?", "32_and_64", "32_and_32",
					"64_and_64", "63_and_32", "32_and_64", 1);
			ques[2] = new Question(3, "Automatic type conversion is possible in which of the possible cases?",
					"Byte_to_int", "Int_to_long", "Long_to_int", "Short_to_int ", "Int_to_long", 1);
			ques[3] = new Question(4, "Which of the following is not a Java features?", "Dynamic",
					"Architecture_Neutral", "Use_of_pointers", "Object-oriented", "Use_of_pointers", 1);
			ques[4] = new Question(5, "What is the return type of the hashCode() method in the Object class?", "Object",
					"int", "long", "void", "int", 1);
		}
		edao.javatest(id, name, topic, ldt, ques);

	}

	@Override
	public void htmlexam() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter examid : ");
		int id = sc.nextInt();

		System.out.println("Enter name of Exam");
		String name = sc.next();

		System.out.println("Enter Topic");
		String topic = sc.next();

		System.out.println("enter date(dd/MM/yyyy)");
		String dt = sc.next();
		LocalDate ldt = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Question[] ques = new Question[5];
		{
			ques[0] = new Question(1, "Number of primitive data types in Java are?", "6", "7", "8", "9", "8", 1);
			ques[1] = new Question(2, "What is the size of float and double in java?", "32_and_64", "32_and_32",
					"64_and_64", "63_and_32", "32_and_64", 1);
			ques[2] = new Question(3, "Automatic type conversion is possible in which of the possible cases?",
					"Byte_to_int", "Int_to_long", "Long_to_int", "Short_to_int ", "Int_to_long", 1);
			ques[3] = new Question(4, "Which of the following is not a Java features?", "Dynamic",
					"Architecture_Neutral", "Use_of_pointers", "Object-oriented", "Use_of_pointers", 1);
			ques[4] = new Question(5, "What is the return type of the hashCode() method in the Object class?", "Object",
					"int", "long", "void", "int", 1);
		}
		edao.htmltest(id, name, topic, ldt, ques);

//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter examid : ");
//		int id = sc.nextInt();
//
//		System.out.println("Enter name of Exam");
//		String name = sc.next();
//
//		System.out.println("Enter Topic");
//		String topic = sc.next();
//
//		System.out.println("enter date of joining(dd/MM/yyyy)");
//		String dt = sc.next();
//		LocalDate ldt = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//
//		List<Question> qarr = new ArrayList<>();
//		System.out.println("Enter no of Question");
//		int no = sc.nextInt();
//		for (int i = 0; i < no; i++) {
//			System.out.println("Enter Question no");
//			int qno = sc.nextInt();
//			System.out.println("Enter Question");
//			String que = sc.next();
//			System.out.println("Enter Option 1");
//			String opion1 = sc.next();
//			System.out.println("Enter Option 2");
//			String opion2 = sc.next();
//			System.out.println("Enter Option 3");
//			String opion3 = sc.next();
//			System.out.println("Enter Option 4");
//			String opion4 = sc.next();
//			System.out.println("Enter Answer");
//			String ans = sc.next();
//			System.out.println("Enter marks");
//			int marks = sc.nextInt();
//			Question q = new Question(qno, que, opion1, opion2, opion3, opion4, ans, marks);
//			qarr.add(q);
//		}
//		Exam e = new Exam(id, name, topic, ldt, qarr);
//		edao.save(e);
	}

}
