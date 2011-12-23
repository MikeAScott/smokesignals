package com.enkida.smokesignals

import org.grails.taggable.TagLink

class MemberService {

    static transactional = true

    def getAll = {
		Member.getAll()
    }
	
	def findByTagList = {tags ->
		
		def memberInstanceList = new HashSet()
		
		tags.each {tag ->
			def resultSet = Member.findAllByTag(tag)
			memberInstanceList.addAll(resultSet)
		}
		
		return memberInstanceList
		
	}
	
}
