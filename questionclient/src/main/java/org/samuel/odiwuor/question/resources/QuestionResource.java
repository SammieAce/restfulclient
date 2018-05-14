package org.samuel.odiwuor.question.resources;

//root resource class

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



import org.samuel.odiwuor.question.model.Question;
import org.samuel.odiwuor.question.service.QuestionService;


@Path("/questions")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class QuestionResource {

	QuestionService questionService = new QuestionService();
	
	//method to get list of all questions
	@GET
	public List<Question> getQuestions(){
		return questionService.getAllQuestions();
	}
	
	//method to add a question
	@POST
	public Question addQuestion(Question question) {
		return questionService.addQuestion(question);
	}
	
	//method to get a single question by id
	@GET
	@Path("/{questionId}")
	public Question getQuestion(@PathParam("questionId") long id) {
		return questionService.getQuestion(id);
	}
	
	//method to the sub-resource 'choices'
	@Path("/{questionId}/choices")
	public ChoiceResource getChoiceResource() {
		return new ChoiceResource();
	}
	
}

