import com.enkida.smokesignals.Member

class BootStrap {
	
	def executorService
	def queueConsumerService

    def init = { servletContext ->
		bootStrapMembers()
		bootStrapProducerConsumer()
    }
	
	def bootStrapMembers = {
		log.debug("BootStrapping members...")
		new Member(surname : 'Rose', forename : 'Steve', email : 'stevan.rose@gmail.com').save(failOnError : true)
		new Member(surname : 'Hill', forename : 'Mark', email : 'mark@teos.com').save(failOnError : true)
	}
	
	def bootStrapProducerConsumer = {
		log.debug("BootStrapping Producer Consumer queue...")
		queueConsumerService.setStopThread(false)
		executorService.execute(queueConsumerService)
	}
	
    def destroy = {
    }
	
}
