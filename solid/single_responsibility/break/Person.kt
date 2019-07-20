data class Person(val name: String, val surname: String, val bornYear: Int,
                  val city: String, val street: String, val houseNumber: String,
                  val email: String, val phoneNumber: String)
{

    fun createSummary(): ByteArray {
        //create file with the data and return its bytes
        return byteArrayOf() //mock
    }

    fun isEmailValid(): Boolean {
        val pattern = Pattern.compile("^.+@.+\\..+$")
        val matcher = pattern.matcher(email)
        return matcher.matches()
    }

    fun isPhoneNumberValid(): Boolean {
        val pattern = Pattern.compile("^([+][0-9]{2})*[0-9]{9}\$")
        val matcher = pattern.matcher(phoneNumber)
        return matcher.matches()
    }
}