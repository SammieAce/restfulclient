package org.samuel.odiwuor.question.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.samuel.odiwuor.question.database.DatabaseClass;
import org.samuel.odiwuor.question.model.Choice;
import org.samuel.odiwuor.question.model.Question;

public class ChoiceService {
	//local member variable
	private Map<Long, Question> questions = DatabaseClass.getQuestions();
	
	
	
	//returns list of all choice instances
	public List<Choice> getAllChoices(long choiceId) {
		Map<Long, Choice> choices = questions.get(choiceId).getChoices();
		return new ArrayList<Choice>(choices.values());
	}
	
	//returns a choice given question and choice id
	public Choice getChoice(long questionId, long choiceId) {
		Map<Long, Choice> choices = questions.get(questionId).getChoices();
		return choices.get(choiceId);
	}
	
	//takes a choice object and adds it to the database
	public Choice addChoice(long choiceId, Choice choice) {
		Map<Long, Choice> choices = questions.get(choiceId).getChoices();
		choice.setId(choices.size() + 1);
		choices.put(choice.getId(), choice);
		return choice;
	}
	

		
}


