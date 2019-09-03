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

Please refer to [rc-codegen](https://github.com/tylerlong/rc-codegen) project.

The generated code is formatted by IntelliJ IDEA.


## Release a new version

Update version numbers in `build.gradle`.

    ./gradlew -PbintrayUser=bintrayUser -PbintrayApiKey=bintrayApiKey bintrayUpload
