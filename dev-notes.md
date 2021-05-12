## Setup

```
cp src/test/resources/.env.sample src/test/resources/.env
edit src/test/resources/.env
```


## Test

```
./gradlew test
```

Test a specific test case:

```
./gradlew test --tests com.ringcentral.OkHttpClientTest
```


## Auto generate models

All the files inside `src/main/java/com/ringcentral/definitions/` and `src/main/java/com/ringcentral/paths/` are auto-generated.

The generated code is formatted by IntelliJ IDEA.


## Release a new version

Update version numbers in `build.gradle`.

```
./gradlew uploadArchives
```

Go to https://s01.oss.sonatype.org/#stagingRepositories

Login, "Close" and "Release" the SDK.


## Publish java doc

```
./gradlew javadoc
cp -r build/docs/javadoc/* ./docs/
```

Issue: https://stackoverflow.com/questions/52326318/maven-javadoc-search-redirects-to-undefined-url
Fixed in `build.gradle` by:

```gradle
options.addBooleanOption('-no-module-directories', true)
```
