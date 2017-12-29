package br.com.poups.core;

public class Message {
	private String message;
	private String title;
	private Severity severity;
	
	public Message(String message, String title, Severity severity) {
		super();
		this.message = message;
		this.title = title;
		this.severity = severity;
	}

	public Message(String message, Severity severity) {
		super();
		this.message = message;
		this.severity = severity;
	}

	public String getMessage() {
		return message;
	}

	public String getTitle() {
		return title;
	}
	
	public Severity getSeverity() {
		return severity;
	}
}
