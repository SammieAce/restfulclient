package org.samuel.odiwuor.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.samuel.odiwuor.question.model.Question;

public class RestApiClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client client = ClientBuilder.newClient();
		
		WebTarget baseTarget = client.target("http://localhost:8080/questionclient/webapi/");
		WebTarget questionsTarget = baseTarget.path("questions");
		WebTarget singleQuestionTarget = questionsTarget.path("{questionId}");
		
		Question question1 = singleQuestionTarget
				.resolveTemplate("questionId", "1")
				.request(MediaType.APPLICATION_JSON)
				.get(Question.class); 
		
		Question question2 = singleQuestionTarget
				.resolveTemplate("questionId", "2")
				.request(MediaType.APPLICATION_JSON)
				.get(Question.class);
		
		Question question3 = singleQuestionTarget
				.resolveTemplate("questionId", "3")
				.request(MediaType.APPLICATION_JSON)
				.get(Question.class);
		
		Question question4 = singleQuestionTarget
				.resolveTemplate("questionId", "4")
				.request(MediaType.APPLICATION_JSON)
				.get(Question.class);
		
		
		
		
		
		//Question question = response.readEntity(Question.class);
		System.out.println(question1.getQuestion());
		System.out.println(question2.getQuestion());
		System.out.println(question3.getQuestion());
		System.out.println(question4.getQuestion());
	}

}
