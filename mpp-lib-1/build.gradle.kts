plugins {
    id("kotlin-multiplatform")
}

kotlin {
    jvm()
    sourceSets {
        getByName("commonMain").dependencies {
            implementation(kotlin("stdlib"))
            implementation(project(":mpp-lib-0"))
        }

        getByName("jvmMain").dependencies {
            implementation(kotlin("stdlib-jdk8"))
        }
    }
}