buildscript {
    allprojects {
        extra["kotlin_version"] = "1.3.70-SELLMAIR"
    }

    repositories {
        maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
        maven { setUrl("https://dl.bintray.com/kotlin/kotlin-dev") }
        mavenCentral()
        google()
        mavenLocal()
        jcenter()
    }

    dependencies {
        classpath(kotlin("gradle-plugin:${rootProject.extra["kotlin_version"]}"))
        classpath("com.android.tools.build:gradle:3.5.2")

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

