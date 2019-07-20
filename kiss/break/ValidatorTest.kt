//all tests in single function could be no good idea
class ValidatorTest {

    @Test
    fun validatePasswords() {
        assertTrue(Validator.isPasswordValid("Abcde0"))
        assertTrue(Validator.isPasswordValid("1234Ab"))
        assertTrue(Validator.isPasswordValid("Abc d0"))
        assertFalse(Validator.isPasswordValid(""))
        assertFalse(Validator.isPasswordValid("Abcd0"))
        assertFalse(Validator.isPasswordValid("abcdef"))
        assertFalse(Validator.isPasswordValid("123456"))
        assertFalse(Validator.isPasswordValid("ABCDEF"))
    }
}