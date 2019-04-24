package org.brapi.brapiIntroClassJavaClient.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.brapi.brapiIntroClassJavaClient.model.Program;
import org.brapi.brapiIntroClassJavaClient.model.Study;
import org.brapi.brapiIntroClassJavaClient.model.Trial;

public class JavaClientMain {

	public static void main(String[] args) {
		Scanner userInputScanner = new Scanner(System.in);
		String repeat = "y";
		try {

			while (repeat.equalsIgnoreCase("y")) {
				System.out.println("This is the BrAPI 101 Java Client!");
				Program program = selectProgram(userInputScanner);

				System.out.println("");
				Trial trial = selectTrial(program, userInputScanner);

				System.out.println("");
				printStudies(trial);

				System.out.println("");
				System.out.println("Again? (y/n)");
				repeat = userInputScanner.nextLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			userInputScanner.close();
		}
	}

	private static Program selectProgram(Scanner userInputScanner) {
		System.out.println("");
		System.out.println("Loading...");

		BrAPIClientService brAPIClientService = new BrAPIClientService();
		List<Program> programs = brAPIClientService.getPrograms();

		System.out.println("Please select from the available Programs: ");
		System.out.println("");
		System.out.println("Id\tProgram Name");
		System.out.println("--\t------------");

		Map<String, Program> programMap = new HashMap<String, Program>();
		for (Program program : programs) {
			System.out.println(program.getProgramDbId() + "\t" + program.getProgramName());
			programMap.put(program.getProgramDbId(), program);
		}

		System.out.println("");
		System.out.println("Enter Program Id: ");
		String programId = userInputScanner.nextLine();

		if (programMap.containsKey(programId)) {
			return programMap.get(programId);
		} else {
			return null;
		}
	}

	private static Trial selectTrial(Program program, Scanner userInputScanner) {
		System.out.println("");
		System.out.println("Loading...");

		BrAPIClientService brAPIClientService = new BrAPIClientService();
		List<Trial> trials = brAPIClientService.getTrials(program.getProgramDbId());

		System.out.println("Please select a Trial from " + program.getProgramName() + ": ");
		System.out.println("");
		System.out.println("Id\tTrial Name");
		System.out.println("--\t----------");

		Map<String, Trial> trialsMap = new HashMap<String, Trial>();
		for (Trial trial : trials) {
			System.out.println(trial.getTrialDbId() + "\t" + trial.getTrialName());
			trialsMap.put(trial.getTrialDbId(), trial);
		}

		System.out.println("");
		System.out.println("Enter Trial Id: ");
		String trialId = userInputScanner.nextLine();

		if (trialsMap.containsKey(trialId)) {
			return trialsMap.get(trialId);
		} else {
			return null;
		}
	}

	private static void printStudies(Trial trial) {
		System.out.println("");
		System.out.println("Loading...");

		BrAPIClientService brAPIClientService = new BrAPIClientService();
		List<Study> studies = brAPIClientService.getStudies(trial.getTrialDbId());

		System.out.println("Here are the available studies from " + trial.getTrialName());
		System.out.println("");
		System.out.println("Id\tStudy Name");
		System.out.println("--\t----------");

		for (Study study : studies) {
			System.out.println(study.getStudyDbId() + "\t" + study.getStudyName());
		}
	}
}
