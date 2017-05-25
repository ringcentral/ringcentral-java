# ringcentral-java

[![Build Status](https://travis-ci.org/tylerlong/ringcentral-java.svg?branch=master)](https://travis-ci.org/tylerlong/ringcentral-java)
[![Coverage Status](https://coveralls.io/repos/github/tylerlong/ringcentral-java/badge.svg?branch=master)](https://coveralls.io/github/tylerlong/ringcentral-java?branch=master)


## Usage

```java
RestClient restClient = new RestClient(appKey, appSecret, server);
restClient.authorize(username, extension, password);
```


### Send sms

[Send sms](src/test/java/com/ringcentral/SmsTest.java)


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


### Send fax

[Send fax](src/test/java/com/ringcentral/FaxTest.java)


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


### Auto generate models

All the files inside `src/main/java/com/ringcentral/definitions/` and `src/main/java/com/ringcentral/paths/` are auto-generated.

Please refer to [rc-codegen](https://github.com/tylerlong/rc-codegen) project.


### Todo

- Investigate async
    - http://www.jianshu.com/p/1873287eed87
- Publish this libraries to mavenCenter and jCenter
- Support query parameters
- Rewrite in Kotlin
- Url builder
