package org.samuel.odiwuor.question.model;

//model class for creating instances of questions 

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
@XmlRootElement
public class Question {
	
	//member variables
	private long id;
  private String question;
  private Map<Long, Choice> choices = new HashMap<>();
  
  //no argument constructor
  public Question() {
  	
  }
  
  //constructor
  public Question(long id, String question) {
  	this.id = id;
  	this.question = question;
  }
  
  //getters and setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	@XmlTransient
	public Map<Long, Choice> getChoices() {
		return choices;
	}

	public void setChoices (Map<Long, Choice> choices) {
		this.choices = choices;
	}
  
  
	
}



