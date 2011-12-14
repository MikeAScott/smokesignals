package com.enkida.smokesignals

class Member {
	
	String forename
	String surname
	String email
	
    static constraints = {
		email(email : true)
    }
	
}
