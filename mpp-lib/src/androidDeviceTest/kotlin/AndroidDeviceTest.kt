import kotlin.test.Test

/**
 * Expected to fail!
 */
class AndroidDeviceTest {
    @Test
    fun fail() {
        AndroidCommonApi.sayHi()
        CommonApi.throwException()
    }
}