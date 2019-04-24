package org.brapi.brapiIntroClassJavaClient.main;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import org.brapi.brapiIntroClassJavaClient.model.Program;
import org.brapi.brapiIntroClassJavaClient.model.ProgramsResponse;
import org.brapi.brapiIntroClassJavaClient.model.StudiesResponse;
import org.brapi.brapiIntroClassJavaClient.model.Study;
import org.brapi.brapiIntroClassJavaClient.model.Trial;
import org.brapi.brapiIntroClassJavaClient.model.TrialsResponse;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

public class BrAPIClientService {

	private static String BASE_URL = "https://test-server.brapi.org/brapi/v1/";
//	private static String BASE_URL = "https://yambase.org/brapi/v1/";

	public List<Program> getPrograms() {
		Response response = ClientBuilder
				.newClient()
				.register(JacksonJsonProvider.class)
				.target(BASE_URL)
				.path("programs")
				.queryParam("page", 0)
				.queryParam("pageSize", 10)
				.request()
				.get();
		
		ProgramsResponse programs = response.readEntity(ProgramsResponse.class);
		return programs.getResult().getData();
	}

	public List<Trial> getTrials(String programId) {
		// TODO: Implement this method
		
		return new ArrayList<Trial>();
	}

	public List<Study> getStudies(String trialDbId) {
		// TODO: Implement this method
		
		return new ArrayList<Study>();
	}
	
	
	
}
