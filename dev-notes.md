## Test

```
./gradlew test
```

Test a specific test case:

```
./gradlew test --tests com.ringcentral.OkHttpClientTest
```

## Auto generate models

All the files inside `src/main/java/com/ringcentral/definitions/` and `src/main/java/com/ringcentral/paths/` are
auto-generated.

The generated code is formatted by IntelliJ IDEA.

## Release a new version

Update version numbers in `build.gradle`.

```
./gradlew publish
```

Go to https://s01.oss.sonatype.org/#stagingRepositories

Login, "Close" and "Release" the SDK.
