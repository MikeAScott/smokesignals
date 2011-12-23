package com.enkida.smokesignals

class MailJob {
	
	def messageService

	static triggers = {
		simple name: 'trigger', startDelay: 60000, repeatInterval: 60000
	}

	def execute() {
		messageService.sendNewMessages()
	}
	
}
