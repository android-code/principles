class RegisterView {

    fun register() {
        //get inputs from view
        val input = "Password123" //mock
        val reinput = "Password123"
        val email = "example@androidcode.pl"
		
        if(arePasswordsValid(input, reinput) && isEmailValid(email)) {
            //make register call
        }
        else {
            //show validation error
        }
    }

    fun arePasswordsValid(password: String, repassword: String): Boolean {
        val pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{6,}$")
        val matcher = pattern.matcher(password)
        return matcher.matches() && password == repassword

    }

    fun isEmailValid(email: String): Boolean {
        val pattern = Pattern.compile("^.+@.+\\..+$")
        val matcher = pattern.matcher(email)
        return matcher.matches()
    }
	
    //some body
}