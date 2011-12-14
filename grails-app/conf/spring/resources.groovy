// Place your Spring DSL code here
beans = {
	
	linkedBlockingQueue(java.util.concurrent.LinkedBlockingQueue) {}
	
	executorService(java.util.concurrent.Executors) {bean ->
		bean.factoryMethod = "newFixedThreadPool"
		bean.constructorArgs = ["1"]
	}
	
	queueProducerService(com.enkida.smokesignals.QueueProducerService, ref('linkedBlockingQueue')) {}
	
	queueConsumerService(com.enkida.smokesignals.QueueConsumerService, ref('linkedBlockingQueue'), ref('messageService')) {}
	
}
