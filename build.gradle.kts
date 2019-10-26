buildscript {
    repositories {
        maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
        maven { setUrl("https://dl.bintray.com/kotlin/kotlin-dev") }
        mavenCentral()
        google()
        mavenLocal()
        jcenter()
    }

    dependencies {
        classpath(kotlin("gradle-plugin:1.3.50"))
        classpath("com.android.tools.build:gradle:3.5.1")

    }
}

allprojects {
    repositories {
        maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
        maven { setUrl("https://dl.bintray.com/kotlin/kotlin-dev") }
        mavenCentral()
        google()
        mavenLocal()
        jcenter()
    }
}

