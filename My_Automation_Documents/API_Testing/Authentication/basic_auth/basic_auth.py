import requests
from requests.auth import HTTPBasicAuth


auth_token = "156fasfdas2154564df6adf45641d65f1sdf"
user_name = "userOne"
Base_Url = "https://reqres.in"

session = requests.session()
responce= session.get(Base_Url+"request", auth=HTTPBasicAuth(user_name,auth_token))
print(responce.json())
