package day13;

public class Response<T> {
	
	private String statusCode;
	
	private T message;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public T getMessage() {
		return message;
	}

	public void setMessage(T message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Response [statusCode=" + statusCode + ", message=" + message + "]";
	}

	
	
	

}
