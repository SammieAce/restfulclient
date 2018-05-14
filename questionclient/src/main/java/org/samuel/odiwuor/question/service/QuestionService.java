package org.samuel.odiwuor.question.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.samuel.odiwuor.question.database.DatabaseClass;
import org.samuel.odiwuor.question.model.Question;

public class QuestionService {
	//local member variable
	private Map<Long, Question> questions = DatabaseClass.getQuestions();
	
	//two questions for testing purposes
	public QuestionService() {
		questions.put(1L, new Question(1, "The senior most county official in Kenya is?"));
		questions.put(2L, new Question(2, "The chief legal advisor to the government of Kenya is the:"));
		questions.put(3L, new Question(3, "Which of these items is not found in our Kenyan coat of arms?"));
		questions.put(4L, new Question(4, "Which type of these marriages allows polygamy?"));

	}
	//returns list of all question instances
	public List<Question> getAllQuestions() {
		return new ArrayList<Question>(questions.values()); 
	}
	
	//takes a question object and adds it to the database
	public Question addQuestion(Question question) {
		question.setId(questions.size() + 1);
		questions.put(question.getId(), question);
		return question;
	}
	
	
	//returns a question by id
	public Question getQuestion(long id) {
		return questions.get(id);
	}
	

	

	
	
	
}


