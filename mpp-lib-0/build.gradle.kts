plugins {
    id("kotlin-multiplatform")
}

kotlin {
    jvm()
    sourceSets {
        getByName("commonMain").dependencies {
            implementation(kotlin("stdlib"))
        }

        getByName("jvmMain").dependencies {
            implementation(kotlin("stdlib-jdk8"))
        }
    }
}