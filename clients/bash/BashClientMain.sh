#!/bin/bash

BASE_URL='https://test-server.brapi.org/brapi/v1'

echo Welcome to the BrAPI Hackathon Demo Client App!!
echo
echo Loading...

GET_PROGRAMS_URL="$BASE_URL/programs"
PROGRAMS=$(curl -s $GET_PROGRAMS_URL)

PROGRAM_DBIDS=$(echo $PROGRAMS | sed -e 's/[{,]/\n/g' | sed -e 's/[}]/''/g'  | sed -e 's/[]]/''/g' | grep 'programDbId' | sed -E -e 's/"programDbId":"(.*)"/\1/g') 
PROGRAM_NAMES=$(echo $PROGRAMS | sed -e 's/[{,]/\n/g' | sed -e 's/[}]/''/g'  | sed -e 's/[]]/''/g' | grep 'programName' | sed -E -e 's/"programName":"(.*)"/\1/g') 

echo Please select from the available Programs: 
echo 
echo -e "Id\tProgram Name"
echo -e "--\t------------"
paste <(echo "$PROGRAM_DBIDS") <(echo "$PROGRAM_NAMES")

echo Enter Program Id: 
read PROGRAM_DBID

echo Loading...


GET_TRIALS_URL="$BASE_URL/trials?programDbId=$PROGRAM_DBID"
TRIALS=$(curl -s $GET_TRIALS_URL)

TRIAL_DBIDS=$(echo $TRIALS | sed -e 's/[{,]/\n/g' | sed -e 's/[}]/''/g'  | sed -e 's/[]]/''/g' | grep 'trialDbId' | sed -E -e 's/"trialDbId":"(.*)"/\1/g') 
TRIAL_NAMES=$(echo $TRIALS | sed -e 's/[{,]/\n/g' | sed -e 's/[}]/''/g'  | sed -e 's/[]]/''/g' | grep 'trialName' | sed -E -e 's/"trialName":"(.*)"/\1/g') 

echo Please select from the available Trials: 
echo 
echo -e "Id\tTrial Name"
echo -e "--\t------------"
paste <(echo "$TRIAL_DBIDS") <(echo "$TRIAL_NAMES")

echo Enter Trial Id: 
read TRIAL_DBID


echo Loading...


GET_STUDYS_URL="$BASE_URL/studies?programDbId=$PROGRAM_DBID&trialDbId=$TRIAL_DBID"
STUDYS=$(curl -s $GET_STUDYS_URL)

STUDY_DBIDS=$(echo $STUDYS | sed -e 's/[{,]/\n/g' | sed -e 's/[}]/''/g'  | sed -e 's/[]]/''/g' | grep 'studyDbId' | sed -E -e 's/"studyDbId":"(.*)"/\1/g') 
STUDY_NAMES=$(echo $STUDYS | sed -e 's/[{,]/\n/g' | sed -e 's/[}]/''/g'  | sed -e 's/[]]/''/g' | grep 'studyName' | sed -E -e 's/"studyName":"(.*)"/\1/g') 

echo Here are the available Studies from 
echo 
echo -e "Id\tStudy Name"
echo -e "--\t------------"
paste <(echo "$STUDY_DBIDS") <(echo "$STUDY_NAMES")


