# ringcentral-java

[![Build Status](https://travis-ci.org/tylerlong/ringcentral-java.svg?branch=master)](https://travis-ci.org/tylerlong/ringcentral-java)
[![Code Coverage](https://img.shields.io/codecov/c/github/tylerlong/ringcentral-java/master.svg)](https://codecov.io/github/tylerlong/ringcentral-java?branch=master)


## Usage

```java
RestClient restClient = new RestClient(appKey, appSecret, server);
restClient.authorize(username, extension, password);
```


### Send sms

```java
restClient.post("/restapi/v1.0/account/~/extension/~/sms", new com.ringcentral.paths.sms.PostParameters(
                new CallerInfo(senderNumber),
                new CallerInfo[]{new CallerInfo(receiverNumber)},
                "hello world"));
```


### Send message to Glip

```Java
restClient.post("/restapi/v1.0/glip/posts", new com.ringcentral.paths.glip.post.PostParameters(
        groupId,
        "hello world"));
```


### Subscription & notification

```java
Subscription subscription = restClient.subscription(
                new String[]{"/restapi/v1.0/account/~/extension/~/message-store"},
                (message) -> {
                    // do something with message
                });
subscription.subscribe();
```


---

---

---


## For contributors


### Setup

```
cp src/test/resources/.env.sample src/test/resources/.env
edit src/test/resources/.env
```


### Test

```
./gradlew test
```


### Todo

- builder pattern: http://stackoverflow.com/a/997883/862862
- handle binary uploading and downloading
- fax
- avoid public
- add coveralls
- fix IDEA warnings
- generate models
- investigate async
- publish this libraries to mavenCenter and jCenter
