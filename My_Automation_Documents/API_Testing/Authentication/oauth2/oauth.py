import oauth2

consumer = oauth2.Consumer(key="",secret="")
access_token= oauth2.Token(key="",secret="")
client = oauth2.Client(consumer,access_token)
responce= client.request("enter url")
print(responce)

