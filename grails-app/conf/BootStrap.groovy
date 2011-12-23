import com.enkida.smokesignals.Member   
import com.enkida.smokesignals.Message
import org.grails.taggable.TagLink

class BootStrap {
	
	def executorService
	def queueConsumerService

    def init = { servletContext ->
		bootStrapMembers()
		bootStrapMessages()
		bootStrapTags()
    }
	
	def bootStrapMembers = {
		log.debug("BootStrapping members...")
		new Member(surname : 'Rose', forename : 'Steve', email : 'stevan.rose@gmail.com').save(failOnError : true)
		new Member(surname : 'Scott', forename : 'Mike', email : 'mike.a.scott@sky.com').save(failOnError : true)
		new Member(surname : 'Rose', forename : 'Cathy', email : 'cathyjrose@gmail.com').save(failOnError : true)
//		new Member(surname : 'Hill', forename : 'Mark', email : 'mark@teos.co.uk').save(failOnError : true)
	}
	
	def bootStrapTags = {
		
		log.debug("BootStrapping Tags...")
		
		def steve = Member.findByForename('Steve')
		steve.addTag("ScoutLeader").addTag("ScoutParent")
		steve.save(failOnError : true)
		
		def mike = Member.findByForename('Mike')
		mike.addTag("ScoutLeader").addTag("ScoutParent")
		mike.save(failOnError : true)
		
		def cathy = Member.findByForename('Cathy')
		cathy.addTag("ScoutParent")
		cathy.save(failOnError : true)
		
		
	}
	
	def bootStrapMessages = {
		
		Member.list().each {member ->
			new Message(mailFrom:'firstcamelsdalescouts@gmail.com',
				mailTo : member.email,
				subject : 'Test Message from First Camelsdale Scouts',
				body : 'A Scout is to be trusted.',
				status : 'NEW').save(failOnError : true)
		}
		
	}
	
    def destroy = {
    }
	
}
