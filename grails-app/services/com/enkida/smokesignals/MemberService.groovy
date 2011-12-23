package com.enkida.smokesignals

import org.grails.taggable.TagLink

class MemberService {

    static transactional = true

    def getAll = {
		Member.getAll()
    }
	
	def findByTagList = {tags ->
		
		log.debug("***********************")
		log.debug("***********************")
		log.debug("***********************")
		
		def memberInstanceList = new HashSet()
		
		tags.each {tag ->
			def resultSet = Member.findAllByTag(tag)
			memberInstanceList.addAll(resultSet)
		}
		
		log.debug("memberInstanceList has : " + memberInstanceList.size())
		memberInstanceList.each {member ->
			log.debug("${member}")
		}
		
		return memberInstanceList
		
	}
	
}
