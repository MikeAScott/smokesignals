Mike, 

Braindump follows....

Here's a first go at the scout app.

Called smokesignals 'cos it's a tribal communication thingo.

The general ideas is that a member has an email address and is tagged with one or many tags (ScoutLeader, CubLeader, ScoutParent etc.)
This is done via the Grails Taggable Plugin. We then compose messages to one or many tags which are persisted to the db and processed 
by a quartz job (grails quartz plugin) every n minutes.

It's all a bit basic at the mo - just dicking about really - don't give me too much hassle for lack of tests 

DOMAIN
only 2 domain classes (with associated controllers and servisces - pretty self explanatory really.
Member.groovy
Message.groovy

CONFIG
bootstrap.groovy
	Loads, you, Cathy and me into the embedded hsqldb, adds some tags and generates a test message in the db
Mail config 
	is at the bottom of conf/config.groovy including the password to firstcamelsdalescouts@gmail.com

A quartz job grails-app/jobs/MailJob.groovy fires every minute (with an initial minute delay) and sends any messages with status NEW and 
the status to SENT - the actual code for sending mails is commented out in MessageService.

I've created a message/compose which does what I described above.
	grails run-app
	http://localhost:8080/smokesignals/message/list
	Then hit New Message

Feel free to play.