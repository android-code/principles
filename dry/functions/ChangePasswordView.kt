lass ChangePasswordView {

    fun changePassword() {
        //get inputs from view
        val input = "Password123" //mock
        val reinput = "Password123"
		
        if(Validator.arePasswordsValid(input, reinput)) {
            //make register call
        }
        else {
            //show validation error
        }
    }
	
    //some body
}