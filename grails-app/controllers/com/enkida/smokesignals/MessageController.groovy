package com.enkida.smokesignals

class MessageController {

   	def queueProducerService
	def memberService
	
    def index = { }
	
	def compose = {}
	
	def send = {
	
		log.debug(params)
		
		def memberInstanceList = memberService.getAll()
		
		memberInstanceList.each { memberInstance -> 
			def messageContainer = new MessageContainer()
			messageContainer.setTo(memberInstance.email)
			messageContainer.setCc(params.cc)
			messageContainer.setBcc(params.Bcc)
			messageContainer.setFrom(params.from)
			messageContainer.setSubject(params.subject)
			messageContainer.setBody(params.body)
			queueProducerService.addToQueue(messageContainer)
			redirect(action:sent)
			
		}
		
	}
	
	def sent = {}
}
