import requests

API_Key = "key_Value"

BaseUrlWithKey = "https://reqres.in" + API_Key
responce= requests.get(BaseUrlWithKey)
print(responce)
