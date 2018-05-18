package com.test.model;

public class uptype {
	private int uptypeId;
	public int getUptypeId() {
		return uptypeId;
	}
	public void setUptypeId(int uptypeId) {
		this.uptypeId = uptypeId;
	}
	public String getUptypeName() {
		return uptypeName;
	}
	public void setUptypeName(String uptypeName) {
		this.uptypeName = uptypeName;
	}
	@Override
	public String toString() {
		return "uptype [uptypeId=" + uptypeId + ", uptypeName=" + uptypeName + "]";
	}
	private String uptypeName;

}
