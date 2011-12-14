package com.enkida.smokesignals

class MemberService {

    static transactional = true

    def getAll = {
		Member.getAll()
    }
	
}
