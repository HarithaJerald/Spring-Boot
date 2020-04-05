package com.ust.ae;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Alien {
	private int aId;
	private String aName;
	private String tech;
	@Autowired
//	@Qualifier("lap")
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public void show() {
		System.out.println("In Show..");
		laptop.compile();
	}

	// trying to check whether object is created in spring container
	public Alien() {
		super();
		System.out.println("Object is created!!!!!!");
	}
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
}
