package com.enkida.smokesignals

class MessageService {

    static transactional = false

	
	def sendNewMessages = {
		
		def messageInstanceList = Message.findAllWhere(status : 'NEW')
		log.debug("Found " + messageInstanceList.size() + " NEW Messages...")
		
		Message.findAllWhere(status : 'NEW').each {message ->
			log.debug("${message}")
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
