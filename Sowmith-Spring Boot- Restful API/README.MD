
This is an API assignment. And, I am calling it as Sowmith-Spring Boot- Restful API because it treats everything(files) as Object and 
store them on disk, just like AWS S3.
So, what can you do with it!, you can upload file with metadata(default and custom), while metadata is stored on persistence store and 
file on disk.

Usage Instructions:
Run using mvn install and you are all set.

Requirements for Assignment:
Implement a RESTful API spring-boot application that provides the following APIs:

API to upload a file with a few meta-data fields. Persist meta-data in persistence store (In memory DB or file system and store the content on a file system)
API to get file meta-data
API to download content stream (Optional)
API to search for file IDs with a search criterion (Optional)
Write a scheduler in the same app to poll for new items in the last hour and send an email (Optional)
What I did:
All except search(didn't get time), but what I did extra added OAuth2 and JWT Tokens with spring-security.
