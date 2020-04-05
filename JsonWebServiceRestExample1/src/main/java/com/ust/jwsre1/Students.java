package com.ust.jwsre1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
	@Id
	private int sId;
	private String sName;
	private String tech;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Students [sId=" + sId + ", sName=" + sName + ", tech=" + tech + "]";
	}
}
