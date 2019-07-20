class ChangePasswordView {

    fun changePassword() {
        //get inputs from view
        val input = "Password123" //mock
        val reinput = "Password123"
		
        if(isPasswordValid(input) && input == reinput) {
            //make register call
        }
        else {
            //show validation error
        }
    }
    
    fun isPasswordValid(password: String): Boolean {
        val pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{6,}$")
        val matcher = pattern.matcher(password)
        return matcher.matches()
    }
	
    //some body
}