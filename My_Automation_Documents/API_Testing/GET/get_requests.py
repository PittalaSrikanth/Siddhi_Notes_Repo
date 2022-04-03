import requests
import json

parameters = {'page':2}

BaseUrl = "https://reqres.in"
resp= requests.get(BaseUrl+"/api/users",params=parameters)

# print status code
print(resp.status_code)
print(resp.ok)
print(resp.links)
print(resp.reason)
print(resp.next)
print(resp.headers)
print(resp.cookies)
print(resp.history)




#
#
# # print responce
# print(resp)
#
# # print responce in json format
# print(resp.json())
#
# # print total_pages in responce
# print(resp.json()["total_pages"])
#
# # print data in responce
# print(resp.json()["data"])
#
# # print 2nd emp first names in responce
# print(resp.json()["data"][1]["first_name"])
#
# # print all emp first names in responce
# for e in resp.json()["data"]:
#     print(e["first_name"])
# #  OR
# print([e["first_name"] for e in resp.json()["data"]])
#
#
