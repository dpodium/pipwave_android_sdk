# PipwaveSDKAndroid

Android SDK that will call Pipwave API to render payment selection.

Visit http://merchant.pipwave.com for more details

# Building project

After importing project, just rebuild the project and get the newest compilation at **/path/to/project/pipwavesdk/build/outputs/arr**

# Pushing to bintray

After importing the project, local.properties should be created automatically at the project root. Add following details into the file:

```
bintray.user={Bintray username}
bintray.apikey={Bintray API key}
```

Further configurations for Bintray is found in **/path/to/project/pipwavesdk/bintray.gradle**

After building the project, run following commands:

```
gradlew install
gradlew bintrayUpload
```

It will automatically upload the SDK to the Bintray account of your choice.
