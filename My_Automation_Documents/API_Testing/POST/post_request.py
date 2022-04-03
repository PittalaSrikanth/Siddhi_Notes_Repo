import requests
import json

parameters = {
    "name": "morpheus",
    "job": "leader"
}

BaseUrl = "https://reqres.in"
resp= requests.post(BaseUrl+"/api/users",params=parameters)
# print responce
print(resp)

# print responce in json format
print(resp.json())



