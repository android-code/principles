object Validator {

    fun isPasswordValid(password: String): Boolean {
        val pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{6,}$")
        val matcher = pattern.matcher(password)
        return matcher.matches()
    }

    fun arePasswordsValid(password: String, repassword: String): Boolean {
        return isPasswordValid(password) && password == repassword
    }

    fun isEmailValid(email: String): Boolean {
        val pattern = Pattern.compile("^.+@.+\\..+$")
        val matcher = pattern.matcher(email)
        return matcher.matches()
    }
}