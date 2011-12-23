package com.enkida.smokesignals

import org.apache.commons.lang.builder.ToStringBuilder

import org.apache.commons.lang.builder.ToStringStyle
import org.grails.taggable.Taggable

class Member implements Taggable {
	
	String forename
	String surname
	String email
	
    static constraints = {
		email(email : true)
    }
	
	String toString() {
		return ToStringBuilder.reflectionToString(this,
			ToStringStyle.MULTI_LINE_STYLE)
	}
	
}