package com.example.demo;

import java.util.Map;

public class CustomResponse {
	
	private String statusMessage;
	@Override
	public String toString() {
		return "CustomResponse [statusMessage=" + statusMessage + ", statusCode=" + statusCode + ", headers=" + headers
				+ ", isBase64Encoded=" + isBase64Encoded + "]";
	}
	public CustomResponse(String statusMessage, Integer statusCode, Map<String, String> headers,
			boolean isBase64Encoded) {
		super();
		this.statusMessage = statusMessage;
		this.statusCode = statusCode;
		this.headers = headers;
		this.isBase64Encoded = isBase64Encoded;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public Map<String, String> getHeaders() {
		return headers;
	}
	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}
	public boolean isBase64Encoded() {
		return isBase64Encoded;
	}
	public void setBase64Encoded(boolean isBase64Encoded) {
		this.isBase64Encoded = isBase64Encoded;
	}
	private Integer statusCode;
    private Map<String, String> headers;
    private boolean isBase64Encoded; 

}
