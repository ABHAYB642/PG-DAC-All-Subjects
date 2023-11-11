package com.demo.beans;

import java.time.LocalDate;
import java.util.List;

public class Exam {

	private int examid;
	private String ename;
	private String topic;
	private LocalDate ldt;
	private List<Question> questions2;

	public Exam() {
		super();
	}

	public Exam(int examid, String ename, String topic, LocalDate ldt, List<Question> questions2) {
		super();
		this.examid = examid;
		this.ename = ename;
		this.topic = topic;
		this.ldt = ldt;
		this.questions2 = questions2;
	}

	public int getExamid() {
		return examid;
	}

	public void setExamid(int examid) {
		this.examid = examid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public LocalDate getLdt() {
		return ldt;
	}

	public void setLdt(LocalDate ldt) {
		this.ldt = ldt;
	}

	public List<Question> getQuestions2() {
		return questions2;
	}

	public void setQuestions2(List<Question> questions2) {
		this.questions2 = questions2;
	}

	@Override
	public String toString() {
		return "Exam [examid=" + examid + ", ename=" + ename + ", topic=" + topic + ", ldt=" + ldt + ", questions2="
				+ questions2 + "]";
	}

}
