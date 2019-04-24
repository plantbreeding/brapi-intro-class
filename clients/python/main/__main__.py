import BrAPIClientService

def selectProgram():
    print("")
    print("Loading...")
    programs = BrAPIClientService.getPrograms()

    print("Please select from the available Programs: ")
    print("")
    print("Id\tProgram Name")
    print("--\t------------")
    
    programsMap = {}
    for program in programs :
        print(program['programDbId'] + "\t" + program['programName'])
        programsMap[program['programDbId']] = program
        
    print('')
    progSelection = input('Enter Program Id: ')
    
    return programsMap[progSelection]

def selectTrial(program):
    print("")
    print("Loading...")
    trials = BrAPIClientService.getTrials(program['programDbId'])

    print("Please select a Trial from " + program['programName'])
    print("")
    print("Id\tTrial Name")
    print("--\t----------")
    
    trialsMap = {}
    for trial in trials :
        print(trial['trialDbId'] + "\t" + trial['trialName'])
        trialsMap[trial['trialDbId']] = trial
        
    print('')
    progSelection = input('Enter Trial Id: ')
    
    return trialsMap[progSelection]
        
def printStudies(trial):
    print("")
    print("Loading...")
    studies = BrAPIClientService.getStudies(trial['trialDbId'])
    
    print('Here are the available studies from ' + trial['trialName'])
    print('')
    print("Id\tStudy Name")
    print("--\t----------")
    for study in studies :
        print(study['studyDbId'] + "\t" + study['studyName'] )
    print('')
    
def run():
    print('Welcome to the BrAPI Hackathon Demo Client App!!')
    program = selectProgram()
    trial = selectTrial(program)
    printStudies(trial)

again = 'y'
while again == 'y':
    run()
    again = input('Again? (y/n) : ')
