plugins {
    id("com.android.library")
    kotlin("multiplatform")
}

android {
    compileSdkVersion(28)
    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(28)
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    /*
    Situation:
    There are currently two tests implemented
    1. src/commonTest/CommonTest -> should fail
    2. src/androidAndroidTest/AndroidAndroidTest -> should fail

    Running command  ./gradlew connectedAndroidTest  or  ./gradlew connectedAndroidCheck

    Expectation:
    Tests will be executed on device and fail!

    Actual Behaviour:
    No tests are executed and the gradle commands are wrongfully successful.
    Running those instrumented tests will even be wrongfully successful when no devices are connected.

    Workaround:
    Telling the Android Gradle Plugin where to expect the instrumented tests helps.
    */

    /*
    // "Workaround"
    sourceSets {
        getByName("androidTest").java.srcDir(file("src/androidAndroidTest/kotlin"))
    }
     */
}

kotlin {
    android()
//    macosX64("macos")

    sourceSets {
        getByName("commonMain").dependencies {
            implementation(kotlin("stdlib-common"))
        }

        getByName("commonMain").dependencies {
            implementation(kotlin("test"))
            implementation(kotlin("test-annotations-common"))
        }

        getByName("androidMain").dependencies {
            implementation(kotlin("stdlib-jdk8"))
        }

        getByName("androidDeviceTest").dependencies {
            implementation(kotlin("test-junit"))
            implementation("com.android.support.test:runner:1.0.2")
        }

        getByName("androidLocalTest").dependencies {
            implementation(kotlin("test-junit"))
        }
    }
}