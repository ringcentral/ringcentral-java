# ringcentral-java

[![Build Status](https://travis-ci.org/ringcentral/ringcentral-java.svg?branch=master)](https://travis-ci.org/ringcentral/ringcentral-java)
[![Coverage Status](https://coveralls.io/repos/github/ringcentral/ringcentral-java/badge.svg?branch=master)](https://coveralls.io/github/ringcentral/ringcentral-java?branch=master)
[![Download](https://api.bintray.com/packages/tylerlong/maven/ringcentral/images/download.svg)](https://bintray.com/tylerlong/maven/ringcentral/_latestVersion)


## Installation

### Gradle

```groovy
repositories {
  jcenter()
}

dependencies {
  compile 'com.ringcentral:ringcentral:0.3.2'
}
```


### Maven

```xml
<repositories>
  <repository>
    <id>jcenter</id>
    <url>https://jcenter.bintray.com/</url>
  </repository>
</repositories>

<dependency>
  <groupId>com.ringcentral</groupId>
  <artifactId>ringcentral</artifactId>
  <version>0.3.2</version>
  <type>pom</type>
</dependency>
```


## Usage

```java
RestClient restClient = new RestClient(appKey, appSecret, server);
restClient.authorize(username, extension, password);
```


### Url Builder

The following code snippets are equivalent, you can choose whichever based on your preferences:

```java
String endpoint = "/restapi/v1.0/account/~/extension/~/sms";
```

```java
String endpoint = restClient.restApi("v1.0").account("~").extension("~").sms().endpoint();
```

```java
String endpoint = restClient.restApi().account().extension().sms().endpoint();
```

The following code snippets are also equivalent, you can choose whichever based on your preferences:

```java
MessageInfo messageInfo = restClient.post(
    "/restapi/v1.0/account/~/extension/~/sms",
    postParameters, MessageInfo.class);
```

```java
MessageInfo messageInfo = restClient.post(
    restClient.restApi("v1.0").account("~").extension("~").sms().endpoint(),
    postParameters, MessageInfo.class);
```

```java
MessageInfo messageInfo = restClient.post(
    restClient.restApi().account().extension().sms().endpoint(),
    postParameters, MessageInfo.class);
```

```java
MessageInfo messageInfo = restClient.restApi("v1.0").account("~").extension("~").sms()
    .post(postParameters, MessageInfo.class);
```

```java
MessageInfo messageInfo = restClient.restApi().account().extension().sms()
    .post(postParameters, MessageInfo.class);
```

[Url Builder Examples](src/test/java/com/ringcentral/UrlBuilderTest.java)


### Raw Response & Models

#### Raw Response

```
ResponseBody responseBody = restClient.restApi().account().extension().sms()
    .post(postParameters);
String stringBody = responseBody.string();
```

#### Models

```java
MessageInfo messageInfo = restClient.restApi().account().extension().sms()
    .post(postParameters, MessageInfo.class);
```


### Send sms

[Example](src/test/java/com/ringcentral/SmsTest.java)


### Glip related

[Example](src/test/java/com/ringcentral/GlipTest.java)


### Specify query parameters

[Example](src/test/java/com/ringcentral/QueryParameterTest.java)


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

[Example](src/test/java/com/ringcentral/SubscriptionTest.java)


### Send fax

[Example](src/test/java/com/ringcentral/FaxTest.java)


### Upload & Download binary files

[Example](src/test/java/com/ringcentral/BinaryTest.java)


### Async

You can simply start a new thread.

[Example](src/test/java/com/ringcentral/AsyncTest.java)


## More examples

Please check the [test cases](src/test/java/com/ringcentral).


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


### Release a new version

Update version numbers in `build.gradle`.

    ./gradlew -PbintrayUser=bintrayUser -PbintrayApiKey=bintrayApiKey bintrayUpload


### Todo

- Rewrite in Kotlin - optional, low priority
