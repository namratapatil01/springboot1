package com.tka.entity;

public class Classroom {

	private int clsId;
	private String clsName;

	public int getClsId() {
		return clsId;
	}

	public void setClsId(int clsId) {
		this.clsId = clsId;
	}

	public String getClsName() {
		return clsName;
	}

	public void setClsName(String clsName) {
		this.clsName = clsName;
	}

	public Classroom() {
		super();
	}

	public Classroom(int clsId, String clsName) {
		super();
		this.clsId = clsId;
		this.clsName = clsName;
	}

	@Override
	public String toString() {
		return "Classroom [clsId=" + clsId + ", clsName=" + clsName + "]";
	}
}
