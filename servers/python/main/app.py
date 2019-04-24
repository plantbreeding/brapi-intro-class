from flask import Flask
from flask import request
import json

app = Flask(__name__)

@app.route("/brapi/v1/programs", methods=['GET'])
def getPrograms():
    print(request.method)
    headers = {"content-type": "application/json"}
    programs = {"metadata":{"datafiles":[],"pagination":{"currentPage":0,"pageSize":1000,"totalCount":6,"totalPages":1},"status":[]},
                "result":
                {"data":[
                    {"abbreviation":"P1","leadPerson":"G. Leader","name":"Program 1","objective":"Global Population Improvement","programDbId":"1"},
                    {"abbreviation":"P2","leadPerson":"M. Breeder","name":"Program 2","objective":"XYZ","programDbId":"2"},
                    {"abbreviation":"P3","leadPerson":"W. Select","name":"Program 3","objective":"XYZ","programDbId":"3"},
                    {"abbreviation":"P4","leadPerson":"G. Gain","name":"Program 4","objective":"ABC","programDbId":"4"},
                    {"abbreviation":"P5","leadPerson":"C. Improvement","name":"Program 5","objective":"Processing","programDbId":"5"},
                    {"abbreviation":"P6","leadPerson":"A. Test","name":"Program 6","objective":"Demo","programDbId":"6"}]}}
    return json.dumps(programs), "200", headers


@app.route("/brapi/v1/trials", methods=['GET'])
def getTrial(programDbId=""):
    print(request.method)
    headers = {"content-type": "application/json"}
    trials = {}
    return json.dumps(trials), "200", headers