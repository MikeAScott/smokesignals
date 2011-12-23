package com.enkida.smokesignals

class MessageService {

    static transactional = false
	
	def memberService

	def createMessagesForTagList = {params ->
		def tagList = params.list("tags")
		def memberInstanceList = memberService.findByTagList(tagList)
		memberInstanceList.each {memberInstance ->
			new Message(mailFrom:'firstcamelsdalescouts@gmail.com',
				mailTo : memberInstance.email,
				subject : params.subject,
				body : params.body,
				status : 'NEW').save()
		}
	}
	
	def sendNewMessages = {
		
		def messageInstanceList = Message.findAllWhere(status : 'NEW')
		log.debug("Found " + messageInstanceList.size() + " NEW Messages...")
		
		Message.findAllWhere(status : 'NEW').each {message ->
			
//		STEVE - COMMENTED OUT 'cos we don't want to be sending mails all the time
//			sendMail {
//				to message.mailTo
//				from message.mailFrom
//				subject message.subject
//				body message.body
//			}
			
			message.status = 'SENT'
			message.save()
		}
	}
	
}
