package com.revature.fixtures;

public abstract class Fixtures {
	
	String name, shortDescription, longDescription;

	public Fixtures(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		
		
	}

	public String getName() {
		return this.name;
	}

	public String getShortDescription() {
		return this.shortDescription;
	}

	public String getLongDescription() {
		return this.longDescription;
	}
	
	
	
	
	
	
	

}
