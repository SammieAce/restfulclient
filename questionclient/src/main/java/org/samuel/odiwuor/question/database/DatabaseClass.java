package org.samuel.odiwuor.question.database;


import java.util.HashMap;
import java.util.Map;



import org.samuel.odiwuor.question.model.Choice;
import org.samuel.odiwuor.question.model.Question;
//database stub
public class DatabaseClass {

	private static Map<Long, Question> questions = new HashMap<>();
	private static Map<Long, Choice> choices = new HashMap<>();
	
	public static Map<Long, Question> getQuestions() {
		return questions;
	}
	//remember to delete this if not working later
	public static Map<Long, Choice> getChoices() {
		// TODO Auto-generated method stub
		return choices;
	}
	

	
	
	
}
