import requests
import json

parameters = {
    "name": "morpheus",
    "job": "zion resident"
}

BaseUrl = "https://reqres.in"
resp= requests.put(BaseUrl+"/api/users/2",params=parameters)
# print responce
print(resp)

# print responce in json format
print(resp.json())



