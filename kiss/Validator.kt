object Validator {

    //at this moment there is only need to valid password and email
    //for register and login purpose
    
    fun isPasswordValid(password: String): Boolean {
        val pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{6,}$")
        val matcher = pattern.matcher(password)
        return matcher.matches()
    }

    fun isEmailValid(email: String): Boolean {
        val pattern = Pattern.compile("^.+@.+\\..+$")
        val matcher = pattern.matcher(email)
        return matcher.matches()
    }

    //don't make polish phone number validator, it costs time to create regex
    //there is no need to use it in app at this moment
    fun isPhoneNumberValid(number: String): Boolean {
        val pattern = Pattern.compile("(?<!\\w)(\\(?(\\+|00)?48\\)?)?[ -]?\\d{3}[ -]?\\d{3}[ -]?\\d{3}(?!\\w)")
        val matcher = pattern.matcher(number)
        return matcher.matches()
    }
}