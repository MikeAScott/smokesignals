package com.enkida.smokesignals;

import java.util.concurrent.LinkedBlockingQueue;

import org.apache.log4j.Logger;

public class QueueProducerService {
	
	private final LinkedBlockingQueue<MessageContainer> linkedBlockingQueue;
	private static Logger log = Logger.getLogger(LoggerHelper.getClassName());
	
	public QueueProducerService(LinkedBlockingQueue<MessageContainer> linkedBlockingQueue) {
		super();
		this.linkedBlockingQueue = linkedBlockingQueue;
	}
	
	public void addToQueue(MessageContainer messageContainer) {
		
		try {
			linkedBlockingQueue.put(messageContainer);
		} catch (InterruptedException e) {
			log.error("Error putting to queue.", e);
		}
		
	}


}
