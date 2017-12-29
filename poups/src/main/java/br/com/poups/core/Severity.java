package br.com.poups.core;

public enum Severity {
	SUCCESS("alert-success"),INFO("alert-info"),WARNING("alert-warning"),ERROR("alert-error");
	
	private String clazz;
	
	Severity(String c) {
		this.clazz = c;
	}
	
	public String getClazz() {
		return this.clazz;
	}
}
