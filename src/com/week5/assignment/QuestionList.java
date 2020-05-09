package com.week5.assignment;

import java.util.ArrayList;

public class QuestionList {

	private ArrayList<Question> questionList = new ArrayList<Question>();

	void generateQuestionList() {
		this.questionList.add(new Question("Who is the President of India?", "Donald Trump", "Ramnath Kovind",
				"Narendra Modi", "None", "Ramnath Kovind"));
		this.questionList.add(new Question("Who is the Prime Minister of India?", "Donald Trump", "Ramnath Kovind",
				"Narendra Modi", "None", "Narendra Modi"));
		this.questionList.add(new Question("Who is the Chief Minister of Assam?", "Akhil Gogoi", "Sarbananda Sonowal",
				"Narendra Modi", "None", "Sarbananda Sonowal"));
		this.questionList.add(new Question("Who is CJI of India?", "Sharad Arvind Bobde", "Ranjan Gogoi",
				"T. S. Thakur", "None", "Sharad Arvind Bobde"));
		this.questionList.add(new Question("Who is the President of USA?", "Donald Trump", "Ramnath Kovind",
				"Narendra Modi", "None", "Donald Trump"));
		this.questionList.add(new Question("Who is the President of Canada?", "Donald Trump", "Justin Trudeau",
				"Jack Daniels", "None", "Justin Trudeau"));

	}

	public Question getQuestionObject(int i) {
		return questionList.get(i);
	}

	public boolean checkQuestion(int i, String answer) {
		return answer.equals(questionList.get(i).getCorrectOption());
	}

}
