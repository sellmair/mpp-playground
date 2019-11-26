import org.junit.Test

class AndroidLocalTest {

    @Test
    fun fail() {
        AndroidCommonApi.sayHi()
        CommonApi.throwException()
    }
}