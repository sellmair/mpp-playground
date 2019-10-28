plugins {
    id("com.android.library")
    id("kotlin-multiplatform")
}

android {
    compileSdkVersion(28)
}

kotlin {
    android()
}

kotlin.sourceSets.getByName("androidMain").dependencies {
    implementation(project(":mpp-lib-1"))
    implementation(project(":mpp-lib-0"))
    implementation(kotlin("stdlib-jdk8"))
}