class ResetPasswordView {

    fun register() {
        //get inputs from view
        val input = "Password123" //mock
        val reinput = "Password123"
        val email = "example@androidcode.pl"
        
        if(Validator.arePasswordsValid(input, reinput) && Validator.isEmailValid(email)) {
            //make register call
        }
        else {
            //show validation error
        }
    }
    
    //some body
}