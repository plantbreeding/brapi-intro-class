#!/usr/bin/env node

const inquirer = require("inquirer");
const chalk = require("chalk");
const shell = require("shelljs");
const BrAPIClientService = require("./BrAPIClientService");

const run = async () => {
		console.log("This is the BrAPI 101 JavaScript Client!");
		selectProgram()
		.then(function(program){
			console.log("");
			selectTrial(program)
			.then(function(trial){
				console.log("");
				printStudies(trial)
				.then(function(){
					console.log("");
					inquirer.prompt({name: "repeat", type: "input", message: "Again? (y/n) "})
					.then(function(answer){
						if (answer.repeat == 'y'){
							run();
						}
					});
				});
			});
		});
};

const selectProgram = async () => {
	console.log("");
	console.log("Loading...");

	var programs = await BrAPIClientService.getPrograms();
	
	console.log("Please select from the available Programs: ");
	console.log("");
	console.log("Id\tProgram Name");
	console.log("--\t------------");

	var programMap = {};
	for (i in programs) {
		var program = programs[i];
		console.log(program.programDbId + "\t" + program.programName);
		programMap[program.programDbId] = program;
	}

	console.log("");
	var answer = await inquirer.prompt({name: "programId", type: "input", message: "Enter Program Id: "});

	return new Promise(resolve => {
		resolve(programMap[answer.programId]);
	});
}

const selectTrial = async (program) => {
	console.log("");
	console.log("Loading...");

	var trials = await BrAPIClientService.getTrials(program.programDbId);

	console.log("Please select a Trial from " + program.programName + ": ");
	console.log("");
	console.log("Id\tTrial Name");
	console.log("--\t----------");

	var trialMap = {};
	for (i in trials) {
		var trial = trials[i];
		console.log(trial.trialDbId + "\t" + trial.trialName);
		trialMap[trial.trialDbId] = trial;
	}

	console.log("");
	var answer = await inquirer.prompt({name: "trialId", type: "input", message: "Enter Trial Id: "});

	return new Promise(resolve => {
		resolve(trialMap[answer.trialId]);
	});
}

const printStudies = async (trial) => {
	console.log("");
	console.log("Loading...");

	var studies = await BrAPIClientService.getStudies(trial.trialDbId);

	console.log("Here are the available studies from " + trial.trialName);
	console.log("");
	console.log("Id\tStudy Name");
	console.log("--\t----------");

	for (i in studies) {
		var study = studies[i];
		console.log(study.studyDbId + "\t" + study.studyName);
	}

	return new Promise(resolve => {
		resolve();
	});
}

run();