plugins {
    id(BuildPlugins.androidLibrary)
    id(BuildPlugins.kotlinAndroid)
}

android {
    compileSdkVersion(Configs.compileSdkVersion)

    defaultConfig {
        minSdkVersion(Configs.minSdkVersion)
        targetSdkVersion(Configs.targetSdkVersion)

        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = Configs.testInstrumentationRunner
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(Libraries.kotlin)
    implementation(Libraries.appCompat)
    api(Libraries.material)

    testImplementation(TestLibraries.jUnit)

    androidTestImplementation(TestLibraries.androidTestRunner)
    androidTestImplementation(TestLibraries.espresso)
}
