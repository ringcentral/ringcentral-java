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


### Glip related

[Examples from test cases](src/test/java/com/ringcentral/GlipTest.java)


### Subscription & notification

```java
Subscription subscription = restClient.subscription(
    new String[]{
        "/restapi/v1.0/glip/posts",
        "/restapi/v1.0/account/~/extension/~/message-store",
        // more event filters here
    },
    (message) -> {
        // do something with message
    });
subscription.subscribe();
```

[Examples from test cases](src/test/java/com/ringcentral/SubscriptionTest.java)


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

The generated code is formatted by IntelliJ IDEA.


### Todo

- Investigate async
    - http://www.jianshu.com/p/1873287eed87
- Publish this libraries to mavenCenter and jCenter
- Rewrite in Kotlin
- Url builder
