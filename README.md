# RingCentral SDK for Java

[![Build Status](https://github.com/ringcentral/ringcentral-java/actions/workflows/gradle.yml/badge.svg)](https://github.com/ringcentral/ringcentral-java/actions)
[![Coverage Status](https://coveralls.io/repos/github/ringcentral/ringcentral-java/badge.svg?branch=master)](https://coveralls.io/github/ringcentral/ringcentral-java?branch=master)
[![Chat](https://img.shields.io/badge/chat-on%20glip-orange.svg)](https://glipped.herokuapp.com/)
[![Twitter](https://img.shields.io/twitter/follow/ringcentraldevs.svg?style=social&label=follow)](https://twitter.com/RingCentralDevs)

__[RingCentral Developers](https://developer.ringcentral.com/api-products)__ is a cloud communications platform which can be accessed via more than 70 APIs. The platform's main capabilities include technologies that enable:
__[Voice](https://developer.ringcentral.com/api-products/voice), [SMS/MMS](https://developer.ringcentral.com/api-products/sms), [Fax](https://developer.ringcentral.com/api-products/fax), [Glip Team Messaging](https://developer.ringcentral.com/api-products/team-messaging), [Data and Configurations](https://developer.ringcentral.com/api-products/configuration)__.

[API Reference](https://developer.ringcentral.com/api-docs/latest/index.html) and [APIs Explorer](https://developer.ringcentral.com/api-explorer/latest/index.html).


## Getting help and support

If you are having difficulty using this SDK, or working with the RingCentral API, please visit our [developer community forums](https://community.ringcentral.com/spaces/144/) for help and to get quick answers to your questions. If you wish to contact the RingCentral Developer Support team directly, please [submit a help ticket](https://developers.ringcentral.com/support/create-case) from our developer website.


## Installation

### Gradle

```groovy
repositories {
  mavenCentral()
}

dependencies {
  implementation 'com.ringcentral:ringcentral:[version]'
}
```

Don't forget to replace `[version]` with expected version. You can find the latest versions in the [project's release page](https://github.com/ringcentral/ringcentral-java/releases)


### Maven

```xml
<dependency>
  <groupId>com.ringcentral</groupId>
  <artifactId>ringcentral</artifactId>
  <version>[version]</version>
</dependency>
```

Don't forget to replace `[version]` with expected version. You can find the latest versions in the [project's release page](https://github.com/ringcentral/ringcentral-java/releases)


### Manually

[Download jar here](https://search.maven.org/classic/#search%7Cga%7C1%7Ca%3A%22ringcentral%22) and save it into your java classpath.


## Usage


### Initialization & Authorization

```java
RestClient rc = new RestClient(clientId, clientSecret, server);
rc.authorize(username, extension, password);

// do something with `rc`

rc.revoke();
```

For the `server` parameter, there are two static final string variables in `RestClient`:

```java
public static final String SANDBOX_SERVER = "https://platform.devtest.ringcentral.com";
public static final String PRODUCTION_SERVER = "https://platform.ringcentral.com";
```


### Token refresh

Since 1.0 version, the SDK by default does NOT do auto token refresh.
This is because most of the time it's better to manage token lifecycle manually: `rc.refresh()`.

For simple apps, token auto refresh could be beneficial. So we provide a sugar method: `rc.autoRefresh()`.
This method will start a background timer to refresh token for you every 30 minutes.
You can customize the refresh period, for example, change it to every 50 minutes: `rc.autoRefresh(1000 * 60 * 50)`.


## Code samples

You can find [sample code for all the endpoints](./samples.md).

There is also lots of useful code for your reference in our [test cases](./src/test/java/com/ringcentral).

Auto-generated [JavaDoc](https://ringcentral.github.io/ringcentral-java/).


## Binary content downloading

Some [sample code](./samples.md) for binary content downloading may not work.

Because RingCentral is gradually migrating binary content to CDN such as `media.ringcentral.com`.

For example, to download the attachment of a fax:

```java
// `message` is the fax message object
byte[] content = rc.get<byte[]>(message.attachments[0].uri).bytes();
```

The following does **NOT** work:

```java
// `message` is the fax message object
byte[] content = rc.restapi().account().extension().messageStore(message.id).content(message.attachments[0].id).get();
```

### Rule of thumb

But not all binary content has been migrated to CDN.
If the resource to download provides you with a CDN uri, use that CDN uri.
If there is no CDN uri provided, construct the uri as the [sample code](./samples.md) shows.


## PubNub subscriptions & notifications

Please refer to the [RingCentral PubNub SDK for Java](https://github.com/ringcentral/ringcentral-pubnub-java) project.
