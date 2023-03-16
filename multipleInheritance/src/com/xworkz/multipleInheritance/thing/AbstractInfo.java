package com.xworkz.multipleInheritance.thing;

public abstract class AbstractInfo extends Developer {

	private String createdBy;
	private String updatedBy;

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}


	@Override
	public boolean followStanderds() {
		return true;
	}
	
	

	public boolean underStandingConcepts() {
		return true;
		
	}

}
