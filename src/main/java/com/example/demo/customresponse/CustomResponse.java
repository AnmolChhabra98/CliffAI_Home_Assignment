package com.example.demo.customresponse;

public class CustomResponse<T> {
	private String result;
	private String message;
	private T data;
	
	public CustomResponse(String result, String message, T data) {
		super();
		this.result = result;
		this.message = message;
		this.data = data;
	}
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "CustomResponse [result=" + result + ", message=" + message + ", data=" + data + "]";
	}
}
