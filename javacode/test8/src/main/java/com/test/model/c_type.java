package com.test.model;

public class c_type {
	private int typeId;
	private String typeName;
	private String uptypeName;
	public String getUptypeName() {
		return uptypeName;
	}
	public void setUptypeName(String uptypeName) {
		this.uptypeName = uptypeName;
	}
	private uptype uptype;
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public uptype getUptype() {
		return uptype;
	}
	public void setUptype(uptype uptype) {
		this.uptype = uptype;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public int getUptypeId() {
		return uptypeId;
	}
	public void setUptypeId(int uptypeId) {
		this.uptypeId = uptypeId;
	}
	private int uptypeId;
	@Override
	public String toString() {
		return "c_type [typeId=" + typeId + ", typeName=" + typeName + ", uptype=" + uptype + ", uptypeId=" + uptypeId
				+ "]";
	}

}
