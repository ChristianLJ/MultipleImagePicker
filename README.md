# MultipleImagePicker
---------
<!--[![Build Status](https://api.travis-ci.org/ChristianLJ/MaterialEditText.svg)](https://travis-ci.org/ChristianLJ/MaterialEditText)-->
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://opensource.org/licenses/Apache2)

MultipleImagePicker is an image picker for Android. 

MultipleImagePicker is licensed under the friendly [Apache2 licence].

### Documentation
Various documentation is available:

#### Default config:
```groovy
android {
    compileSdkVersion 25
    buildToolsVersion "25.0.1"
    defaultConfig {
        minSdkVersion 17
        targetSdkVersion 25
    }
}
```
##### Supported languages:
- Danish
- English

#### Screenshots:
![Screenshot 1](https://raw.githubusercontent.com/ChristianLJ/MultipleImagePicker/master/documentation/s1.png)
![Screenshot 2](https://raw.githubusercontent.com/ChristianLJ/MultipleImagePicker/master/documentation/s2.png)
![Screenshot 3](https://raw.githubusercontent.com/ChristianLJ/MultipleImagePicker/master/documentation/s3.png)

### Example:
Use MIP the following way e.g. in a click listener:
```java
ArrayList<String> path = new ArrayList<>();

MIP.with(CurrentActivity.this)
    .setPickerCount(20)
    .setPickerSpanCount(3)
    .setProvider("your.custom.app.provider")
    .setActionBarColor(Color.parseColor("#FF5722"), Color.parseColor("#E64A19"))
    .textOnImagesSelectionLimitReached("Limit Reached!")
    .textOnNothingSelected("Nothing Selected")
    .setArrayPaths(path)
    .setAlbumSpanCount(2, 4)
    .setButtonInAlbumActivity(true)
    .setCamera(true)
    .setReachLimitAutomaticClose(false)
    .startAlbum();
```

Remember to add a custom provider to the application part of your Manifest.xml. See example below:
```xml
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
	
<provider
    android:name="android.support.v4.content.FileProvider"
    android:authorities="your.custom.app.provider"
    android:exported="false"
    android:grantUriPermissions="true">
    <meta-data
        android:name="android.support.FILE_PROVIDER_PATHS"
        android:resource="@xml/provider_paths" />
</provider>
```

And add a provider_paths.xml to the xml folder in your res folder.
```xml
<?xml version="1.0" encoding="utf-8"?>
<paths xmlns:android="http://schemas.android.com/apk/res/android">
    <external-path
        name="external_files"
        path="." />
</paths>
```

### Releases
[Release 1.1.1] is the current latest release. This release is considered stable.


**Gradle configuration:**

Add the following to your build.gradle:
```groovy
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}

...

dependencies {
    ...
    compile 'com.github.ChristianLJ:MultipleImagePicker:1.1.1'
    ...
}
```


### Support
Please use GitHub issues and Pull Requests for support.


### History
Issue tracking and active development is at GitHub.