# BrAPI Intro Class - Client

## Instructions

This is a partial implementation of a very simple command line BrAPI client. When completed, this client should allow the user to navigate the Program-Trial-Study hierarchy and view some details about a selected Study. The basic workflow should look something like this:

1. The user is presented with a list of Program ids to choose from. 
2. The user makes a selection by typing the id and pressing enter.
3. The user is presented with a list of Trial ids to choose from. This list should only contain Trials from the selected Program.
4. The user makes a selection by typing the id and pressing enter.
5. The user is presented with a list of Study ids to choose from. This list should only contain Studies from the selected Program and Trial.
6. The user makes a selection by typing the id and pressing enter.
7. The user is presented with basic information about the selected Study.

The goal of this exercise is to complete the missing pieces of this application so that it is functioning as described above. 

Each of the different programming languages will have a file named *BrAPIClientService*. This file contains the logic to handle BrAPI requests and responses. The method `getPrograms()` has been completed for you as an example. The methods `getTrials()` and `getStudies()` need to be implemented to complete the exercise. 

Each of the different programming languages will have specific instructions on how to install and run the project in that language.
