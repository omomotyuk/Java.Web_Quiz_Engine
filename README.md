
# Web Quiz Engine

This project is a multi-user web service for creating and solving quizzes using REST API, an embedded database, security, and other technologies. It concentrates on the server-side ("engine") without a user interface at all. The project stages are described in terms of the client-server model, where the client can be a browser, the curl tool, a REST client (like postman), or something else.

## Description

At the first stage, a simple JSON API returns the same quiz to be solved. The API supports only two operations: getting the quiz and solving it by passing an answer.

