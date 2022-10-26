package coding.withze.testingjunit

import org.junit.Assert.*
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun validUsernameAndCorrectlyRepeatedPassword_return_true() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Ariya",
            "12345",
            "12345"
        )
        assertEquals("oke",result,true)
    }

    @Test
    fun usernameEmpty(){
        val user = ""
        val result = RegistrationUtil.validateRegistrationInput(user,"1234","1234")
        assertEquals("oke",result,true)
    }

    @Test
    fun existingUsername(){
        val user= "Bahram"
        val result = RegistrationUtil.validateRegistrationInput(user,"1234","1234")
        assertEquals("usernameexist", result,true)
    }
    @Test
    fun passwordtidaksama(){
        val user = "lolo"
        val result = RegistrationUtil.validateRegistrationInput(user,"000000","111111")
        assertEquals("oke",result,true)
    }
    @Test
    fun passwordkurangdari6(){
        val result = RegistrationUtil.validateRegistrationInput("caca","000","000")
        assertEquals("oke",result,true)
    }
    @Test
    fun passwordlebih50(){
        val result = RegistrationUtil.validateRegistrationInput("cici","00000000000000000000000000000000000000000000000000000000000000000000000000000000","00000000000000000000000000000000000000000000000000000000000000000000000000000000")
        assertEquals("oke",result,true)
    }



}