## Test

```
./gradlew test
```

Test a specific test case:

```
./gradlew test --tests com.ringcentral.OkHttpClientTest
```

## Auto generate models

All the files inside `src/main/java/com/ringcentral/definitions/` and
`src/main/java/com/ringcentral/paths/` are auto-generated.

The generated code is formatted by IntelliJ IDEA.

## Release a new version

Update version numbers in `build.gradle`.

```
./gradlew publish
```

Go to https://s01.oss.sonatype.org/#stagingRepositories

Login, "Close" and "Release" the SDK.

## New way to release a new version

Update version numbers in `build.gradle`.

```
rm -rf ./build/staging-deploy
./gradlew publish
cd ./build/staging-deploy
zip -r bundle.zip com/
```

Upload bundle.zip to https://central.sonatype.com/publishing

After validation, don't forget to click the "Publish" button.
