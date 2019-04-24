#!/usr/bin/env node

const BASE_URL = "https://test-server.brapi.org/brapi/v1/";
// const BASE_URL = "https://yambase.org/brapi/v1/";

const request = require('request-promise');

const getPrograms = () => {
	const options = {
		method: 'GET',
		uri: BASE_URL + 'programs',
		qs: {
			page: 0,
			pageSize: 10
		},
		json: true
	}
	
	return request(options)
		.then(function(response){
			
		  return response.result.data;
		  
		})
		.catch(function(err){return console.log(err);});
};

const getTrials = (programDbId) => {
};

const getStudies = (trialDbId) => {
};

module.exports.getPrograms = getPrograms;
module.exports.getTrials = getTrials;
module.exports.getStudies = getStudies;