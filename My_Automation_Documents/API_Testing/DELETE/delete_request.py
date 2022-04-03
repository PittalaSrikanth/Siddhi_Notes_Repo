import requests
import json


BaseUrl = "https://reqres.in"
resp= requests.delete(BaseUrl+"/api/users/2")
# print responce
print(resp)

# print responce in json format
print(resp.status_code)



