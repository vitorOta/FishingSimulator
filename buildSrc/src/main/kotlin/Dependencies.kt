/**
 *
 * @author Vitor Ota
 * @since 10/05/2019
 */
object BuildPlugins {
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.gradleVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
    const val kotlinKapt = "kotlin-kapt"
}

object Configs {
    const val compileSdkVersion = 28
    const val targetSdkVersion = 28
    const val minSdkVersion = 19

    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

object Versions {
    const val kotlin = "1.3.31"
    const val gradleVersion = "3.4.0"

    const val appCompat = "1.0.2"
    const val kotlinExtensions = "1.0.2"
    const val constraintLayout = "1.1.3"
    const val navigation = "2.1.0-alpha03"

    //test and androidTest
    const val jUnit = "4.12"
    const val androidTestRunner = "1.1.1"
    const val espresso = "3.1.1"
}

object Modules {
    //app
    const val app = ":app"

    object Features {
        private const val prefix = ":features"
        const val login = "$prefix:login"
        const val game = "$prefix:game"
        const val ranking = "$prefix:ranking"
        const val about = "$prefix:about"
    }

    object Libraries {
        private const val prefix = ":libraries"
        const val ui_components = "$prefix:ui_components"
        const val actions = "$prefix:actions"
    }
}

object Libraries {
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val kotlinExtensions = "androidx.core:core-ktx:${Versions.kotlinExtensions}"
    const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    const val navigationFragment =
            "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
}

object TestLibraries {
    //test
    const val jUnit = "junit:junit:${Versions.jUnit}"

    //androidTest
    const val androidTestRunner = "androidx.test:runner:${Versions.androidTestRunner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}