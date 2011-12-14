package com.enkida.smokesignals;

import java.util.concurrent.LinkedBlockingQueue;

import org.apache.log4j.Logger;

public class QueueConsumerService implements Runnable {
	
	private final LinkedBlockingQueue<MessageContainer> linkedBlockingQueue;
	private volatile boolean stopThread = false;
	
	private Messager messageService;

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(LoggerHelper.getClassName());
	
	public QueueConsumerService(LinkedBlockingQueue<MessageContainer> linkedBlockingQueue, Messager messageService) {
		this.linkedBlockingQueue = linkedBlockingQueue;
		this.messageService = messageService;
	}

	public void run() {
		while (!stopThread) {
			MessageContainer messageContainer = linkedBlockingQueue.poll();
			if (messageContainer != null) {
				messageService.sendEmail(messageContainer);
			}
		}
		
	}
	
	public void setStopThread(boolean stopThread) {
		this.stopThread = stopThread;
	}

}
