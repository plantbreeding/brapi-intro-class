import requests

##BASE_URL = 'https://yambase.org/brapi/v1'
BASE_URL = 'https://test-server.brapi.org/brapi/v1'

def getPrograms():
    url= BASE_URL + '/programs'
    params= {'page': 0, 'pageSize' : 10}
    
    res = requests.get(url, params)
    programs = res.json()['result']['data']
    
    return programs

def getTrials(programDbId):
    ## Implement this function
    
    return []
        
def getStudies(trialDbId): 
    ## Implement this function
    
    return []