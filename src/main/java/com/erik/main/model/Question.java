package com.erik.main.model;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "questions")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quesId;

	@Column(name="title")
	private String title;

	@Column(name="optionA")
	private String optionA;

	@Column(name="optionB")
	private String optionB;

	@Column(name="optionC")
	private String optionC;

	@Column(name="ans")
	private int ans;

	@Column(name="chose")
	private int chose;

	public Question() {
		super();
	}

	public Question(int quesId, String title, String optionA, String optionB, String optionC, int ans, int chose) {
		super();
		this.quesId = quesId;
		this.title = title;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.ans = ans;
		this.chose = chose;
	}

	public int getQuesId() {
		return quesId;
	}

	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public int getAns() {
		return ans;
	}

	public void setAns(int ans) {
		this.ans = ans;
	}

	public int getChose() {
		return chose;
	}

	public void setChose(int choosed) {
		this.chose = choosed;
	}

	@Override
	public String toString() {
		return "Question [quesId=" + quesId + ", title=" + title + ", optionA=" + optionA + ", optionB=" + optionB + ", optionC=" + optionC + ", ans=" + ans + ", chose=" + chose + "]";
	}

}
