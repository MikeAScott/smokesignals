package com.enkida.smokesignals

import org.apache.commons.lang.builder.ToStringBuilder
import org.apache.commons.lang.builder.ToStringStyle

class Message {
	
	String mailTo
	String mailFrom
	String subject
	String body
	String status

    static constraints = {
		mailTo(email : true)
		mailFrom(email : true)
		status(inList : ['NEW', 'SENT'])
    }
	
	String toString() {
		return ToStringBuilder.reflectionToString(this,
            ToStringStyle.MULTI_LINE_STYLE)
	}
	
}
