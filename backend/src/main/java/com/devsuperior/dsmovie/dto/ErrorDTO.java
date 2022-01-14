package com.devsuperior.dsmovie.dto;

import java.io.Serializable;
import java.time.Instant;

public class ErrorDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Instant timestamp;
	private Integer status;
	private String message;
	private String path;
	public ErrorDTO() {
	}
	
	public Instant getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
}
