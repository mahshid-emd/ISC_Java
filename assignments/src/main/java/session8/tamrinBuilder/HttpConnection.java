package session8.tamrinBuilder;

public class HttpConnection {
	
	private String url;
	private String port;
	private String user;
	private String password;
	private String timeOut;
	
	public HttpConnection(Builder builder) {
		
		this.url = builder.url;
		this.port = builder.port;
		this.user = builder.user;
		this.password = builder.password;
		this.timeOut = builder.timeOut;
	}
	
	public String getUrl() {
		return url;
	}

	public String getPort() {
		return port;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public String getTimeOut() {
		return timeOut;
	}

	
	public static class Builder {
		private String url;
		private String port;
		private String user;
		private String password;
		private String timeOut;
		
		public Builder url(String url) {
			this.url = url;
			return this;
		}
		
		public Builder port(String port) {
			this.port = port;
			return this;
		}
		
		public Builder user(String user) {
			this.user = user;
			return this;
		}
		
		public Builder password(String password) {
			this.password = password;
			return this;
		}
		
		public Builder timeOut(String timeOut) {
			this.timeOut = timeOut;
			return this;
		}
		
		public HttpConnection build() {
			if (!url.toLowerCase().startsWith("http")) {
				throw new IllegalArgumentException("The url must start with http.");
			}
			return new HttpConnection(this);
		}
		
	}


	@Override
	public String toString() {
		return "HttpConnection [url=" + url + ", port=" + port + ", user=" + user + ", password=" + password
				+ ", timeOut=" + timeOut + "]";
	}

}
