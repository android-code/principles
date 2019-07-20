//make smaller test functions to check many use cases
class ValidatorTestFixed {    

    @Test
    fun checkValidPasswords() {
        assertTrue(Validator.isPasswordValid("Abcde0"))
        assertTrue(Validator.isPasswordValid("1234Ab"))
        assertTrue(Validator.isPasswordValid("Abc d0"))
    }

    @Test
    fun checkEmptyPassword() {
        assertFalse(Validator.isPasswordValid(""))
    }

    @Test
    fun checkToShortPassword() {
        assertFalse(Validator.isPasswordValid("Abcd0"))
    }

    @Test
    fun checkOnlySmallLettersPassword() {
        assertFalse(Validator.isPasswordValid("abcdef"))
    }

    @Test
    fun checkOnlyBigLettersPassword() {
        assertFalse(Validator.isPasswordValid("ABCDEF"))
    }

    @Test
    fun checkOnlyNumbersPassword() {
        assertFalse(Validator.isPasswordValid("123456"))
    }
}