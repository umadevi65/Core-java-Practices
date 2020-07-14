package com.enumsamples;

public enum Sample {
	SRINU("BRO"),SAI("DADDY");

	private String relation;

	private Sample(String relation) {
		this.relation = relation;
	}

	public String getRelation() {
		return this.relation;
	}

}
