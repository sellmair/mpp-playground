plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdkVersion(28)
}

dependencies {
    implementation(project(":mpp-lib-1"))
    implementation(kotlin("stdlib-jdk8"))
}