package com.enkida.smokesignals

class MessageService implements Messager{

    static transactional = false

	public void sendEmail(MessageContainer messageContainer) {
			
		sendMail {
			to messageContainer.getTo()
			from messageContainer.getFrom()
			subject messageContainer.getSubject()
			body messageContainer.getBody()
		}
		
	}
}
