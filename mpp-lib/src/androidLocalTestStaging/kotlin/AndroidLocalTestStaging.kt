import org.junit.Test

class AndroidLocalTestStaging {
    @Test
    fun fail() {
        error("THIS IS SUPPOSED TO FAIL")
    }
}