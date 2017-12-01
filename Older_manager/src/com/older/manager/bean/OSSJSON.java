package com.older.manager.bean;

public class OSSJSON {
	private int code;
	private String message;
	private String request_id;
	private Data data;

	@Override
	public String toString() {
		return "OSSJSON [code=" + code + ", message=" + message
				+ ", request_id=" + request_id + ", data=" + data + "]";
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequest_id() {
		return request_id;
	}

	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public class Data {
		private String access_url;
		private String resource_path;
		private String source_url;
		private String url;
		private String vid;

		@Override
		public String toString() {
			return "Data [access_url=" + access_url + ", resource_path="
					+ resource_path + ", source_url=" + source_url + ", url="
					+ url + ", vid=" + vid + "]";
		}

		public String getAccess_url() {
			return access_url;
		}

		public void setAccess_url(String access_url) {
			this.access_url = access_url;
		}

		public String getResource_path() {
			return resource_path;
		}

		public void setResource_path(String resource_path) {
			this.resource_path = resource_path;
		}

		public String getSource_url() {
			return source_url;
		}

		public void setSource_url(String source_url) {
			this.source_url = source_url;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getVid() {
			return vid;
		}

		public void setVid(String vid) {
			this.vid = vid;
		}
	}
}
