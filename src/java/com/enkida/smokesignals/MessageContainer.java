package com.enkida.smokesignals;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class MessageContainer {

	private String to;
	private String cc;
	private String bcc;
	private String from;
	private String subject;
	private String body;

	public String getBcc() {
		return bcc;
	}
	
	public String getBody() {
		return body;
	}

	public String getCc() {
		return cc;
	}

	public String getFrom() {
		return from;
	}

	public String getSubject() {
		return subject;
	}

	public String getTo() {
		return to;
	}

	public void setBcc(String bcc) {
		this.bcc = bcc;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
}
