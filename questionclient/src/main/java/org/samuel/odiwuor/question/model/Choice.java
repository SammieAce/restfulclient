package org.samuel.odiwuor.question.model;

//model class for creating  instances of question choices.
public class Choice {
	
	//member variables
	private long id;
  private String choice;  //will revisit this later, should be answer variable

  //no argument constructor
  public Choice() {
  	
  }
  //constructor
  public Choice(long id, String choice ) {
  	this.id = id;
  	this.choice = choice;
  }
  
  //getters and setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getChoice() {
		return choice;
	}
	public void setChoice(String choice) {
		this.choice = choice;
	}
	
  
  

}


