package com.test.model;

public class Card {
	private int cId;
	private int typeId;
	private int uId;
	private int pId;
	private String effectiveTime;
	private String InvalidTime;
	private float currentPrice;
	private float originalPrice;
	private String cardname;
	public c_type getC_type() {
		return c_type;
	}
	public void setC_type(c_type c_type) {
		this.c_type = c_type;
	}
	private String cardNote;
	private int attachmentId;
	private String ifreal;
	private String adress;
	private int cstatus;
	private c_type c_type;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	@Override
	public String toString() {
		return "Card [cId=" + cId + ", typeId=" + typeId + ", uId=" + uId + ", pId=" + pId + ", effectiveTime="
				+ effectiveTime + ", InvalidTime=" + InvalidTime + ", currentPrice=" + currentPrice + ", originalPrice="
				+ originalPrice + ", cardname=" + cardname + ", cardNote=" + cardNote + ", attachmentId=" + attachmentId
				+ ", ifreal=" + ifreal + ", adress=" + adress + ", cstatus=" + cstatus + ", c_type=" + c_type + "]";
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getEffectiveTime() {
		return effectiveTime;
	}
	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}
	public String getInvalidTime() {
		return InvalidTime;
	}
	public void setInvalidTime(String invalidTime) {
		InvalidTime = invalidTime;
	}
	public float getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(float currentPrice) {
		this.currentPrice = currentPrice;
	}
	public float getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getCardname() {
		return cardname;
	}
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
	public String getCardNote() {
		return cardNote;
	}
	public void setCardNote(String cardNote) {
		this.cardNote = cardNote;
	}
	public int getAttachmentId() {
		return attachmentId;
	}
	public void setAttachmentId(int attachmentId) {
		this.attachmentId = attachmentId;
	}
	public String getIfreal() {
		return ifreal;
	}
	public void setIfreal(String ifreal) {
		this.ifreal = ifreal;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getCstatus() {
		return cstatus;
	}
	public void setCstatus(int cstatus) {
		this.cstatus = cstatus;
	}

}
