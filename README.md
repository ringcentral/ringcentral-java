# ringcentral-java

[![Build Status](https://travis-ci.org/tylerlong/ringcentral-java.svg?branch=master)](https://travis-ci.org/tylerlong/ringcentral-java)
[![Coverage Status](https://coveralls.io/repos/github/tylerlong/ringcentral-java/badge.svg?branch=master)](https://coveralls.io/github/tylerlong/ringcentral-java?branch=master)


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

#### Subscribe to Glip messages

```java
Subscription subscription = restClient.subscription(
    new String[]{"/restapi/v1.0/glip/posts"},
    (message) -> {
        System.out.println(message);
    });
subscription.subscribe();
```

#### Subscribe to message store

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

- fax
- avoid public
- fix IDEA warnings
- generate models
- investigate async
    - http://www.jianshu.com/p/1873287eed87
- publish this libraries to mavenCenter and jCenter
- improve code coverage
- Support query parameters
