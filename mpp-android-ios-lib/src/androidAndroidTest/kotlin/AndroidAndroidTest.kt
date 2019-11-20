import kotlin.test.Test

class AndroidAndroidTest {
    /**
     * Running  ./gradlew connectedAndroidTest  or  ./gradlew connectedAndroidCheck  is supposed to
     * build, run this test and then fail.
     *
     * Right now, this test will not be executed!
     */
    @Test
    fun fail() {
        CommonApi.throwException()
    }
}