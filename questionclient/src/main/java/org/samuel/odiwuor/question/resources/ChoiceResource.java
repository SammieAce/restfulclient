package org.samuel.odiwuor.question.resources;

//sub-resource class

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.samuel.odiwuor.question.model.Choice;
import org.samuel.odiwuor.question.service.ChoiceService;


@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class ChoiceResource {

	private ChoiceService choiceService = new ChoiceService();
	
	//method to get list of all choices
	@GET
	public List<Choice> getAllChoices(@PathParam("questionId") long questionId) { //might be problem questionid
		return choiceService.getAllChoices(questionId);
	}
	
	
	//method to add choices
	@POST
	public Choice addChoice(@PathParam("questionId") long questionId, Choice choice) { //might be problem questionid
		return choiceService.addChoice(questionId, choice);
	}
	
	//method to get a single choice by id
	@GET
	@Path("/{choiceId}")
	public Choice getChoice(@PathParam("questionId") long questionId, @PathParam("choiceId") long choiceId) {
		return choiceService.getChoice(questionId, choiceId);
	}
	
}


