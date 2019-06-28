plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinAndroidExtensions)
}

android {
    compileSdkVersion(Configs.compileSdkVersion)

    defaultConfig {
        minSdkVersion(Configs.minSdkVersion)
        targetSdkVersion(Configs.targetSdkVersion)

        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = Configs.testInstrumentationRunner

        vectorDrawables.useSupportLibrary = true
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

    implementation(project(Modules.ui_components))
    implementation(project(Modules.actions))

    implementation(project(Modules.login))

    implementation(Libraries.kotlin)
    implementation(Libraries.appCompat)
    implementation(Libraries.kotlinExtensions)
    implementation(Libraries.constraintLayout)

    testImplementation(TestLibraries.jUnit)

    androidTestImplementation(TestLibraries.androidTestRunner)
    androidTestImplementation(TestLibraries.espresso)
}
