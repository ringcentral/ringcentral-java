# RingCentral SDK for Java

[![Build Status](https://travis-ci.org/ringcentral/ringcentral-java.svg?branch=master)](https://travis-ci.org/ringcentral/ringcentral-java)
[![Coverage Status](https://coveralls.io/repos/github/ringcentral/ringcentral-java/badge.svg?branch=master)](https://coveralls.io/github/ringcentral/ringcentral-java?branch=master)
[![Download](https://api.bintray.com/packages/tylerlong/maven/ringcentral/images/download.svg)](https://bintray.com/tylerlong/maven/ringcentral/_latestVersion)
[![Chat](https://img.shields.io/badge/chat-on%20glip-orange.svg)](https://glipped.herokuapp.com/)
[![Community](https://img.shields.io/badge/dynamic/json.svg?label=community&colorB=&suffix=%20users&query=$.approximate_people_count&uri=http%3A%2F%2Fapi.getsatisfaction.com%2Fcompanies%2F102909.json)](https://devcommunity.ringcentral.com/ringcentraldev)
[![Twitter](https://img.shields.io/twitter/follow/ringcentraldevs.svg?style=social&label=follow)](https://twitter.com/RingCentralDevs)

__[RingCentral Developers](https://developer.ringcentral.com/api-products)__ is a cloud communications platform which can be accessed via more than 70 APIs. The platform's main capabilities include technologies that enable:
__[Voice](https://developer.ringcentral.com/api-products/voice), [SMS/MMS](https://developer.ringcentral.com/api-products/sms), [Fax](https://developer.ringcentral.com/api-products/fax), [Glip Team Messaging](https://developer.ringcentral.com/api-products/team-messaging), [Data and Configurations](https://developer.ringcentral.com/api-products/configuration)__.

[API Reference](https://developer.ringcentral.com/api-docs/latest/index.html) and [APIs Explorer](https://developer.ringcentral.com/api-explorer/latest/index.html).

## Installation

### Gradle

```groovy
repositories {
  jcenter()
}

dependencies {
  compile 'com.ringcentral:ringcentral:[version]'
}
```

Don't forget to replace `[version]` with expected version.


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
  <version>[version]</version>
</dependency>
```

Don't forget to replace `[version]` with expected version.


## Manually

[Download jar here](https://bintray.com/tylerlong/maven/ringcentral/_latestVersion) and save it into your java classpath.


## Usage


### Intialization & Authorization

```java
RestClient restClient = new RestClient(clientId, clientSecret, server);
restClient.authorize(username, extension, password);
```

For the `server` parameter, there are two static final string variables in `RestClient`:

```java
public static final String SANDBOX_SERVER = "https://platform.devtest.ringcentral.com";
public static final String PRODUCTION_SERVER = "https://platform.ringcentral.com";
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

The following code snippets are also equivalent:

```java
restClient.post(
    "/restapi/v1.0/account/~/extension/~/sms",
    postParameters);
```

```java
restClient.post(
    restClient.restApi("v1.0").account("~").extension("~").sms().endpoint(),
    postParameters);
```

```java
restClient.post(
    restClient.restApi().account().extension().sms().endpoint(),
    postParameters);
```

```java
restClient.restApi("v1.0").account("~").extension("~").sms()
    .post(postParameters);
```

```java
restClient.restApi().account().extension().sms()
    .post(postParameters);
```

[Url Builder Examples](src/test/java/com/ringcentral/UrlBuilderTest.java)


### Raw Response vs. Models

#### Raw Response

```java
ResponseBody responseBody = restClient.restApi().account().extension().sms()
    .post(postParameters);
// String stringBody = responseBody.string();
// byte[] bytes = resonseBody.bytes();
// ...
```

- ❗️ ❗️ Please don't forget to invoke `responseBody.close()`. Ref: https://github.com/square/okhttp/issues/2311
    - If you invoked `responseBody.string()` you don't need to invoke `responseBody.close()` because the former implicitly closes body.


#### Models

```java
MessageInfo messageInfo = restClient.restApi().account().extension().sms()
    .post(postParameters, MessageInfo.class);
// System.out.println(messageInfo.creationTime)
// ...
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


## More examples

Please check the [test cases](src/test/java/com/ringcentral).
