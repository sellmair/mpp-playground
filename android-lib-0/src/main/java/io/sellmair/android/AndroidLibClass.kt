package io.sellmair.android

import Lib1JvmMainClass

class AndroidLibClass {
    fun main() {

        /**
         * This expression will break in the ide after  ./gradlew jvmJar  is executed with
         * "Check you module classpath for missing or conflicting dependencies"
         *
         * The same expression will be fine after  ./gradlew clean  is executed
         */
        Lib1JvmMainClass().lib0CommonMainClass.sayHello()
    }
}