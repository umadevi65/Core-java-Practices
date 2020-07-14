package com.oops;

public class SampleOOPS {
	String care;
	String exercise;
	String meditation;
	String skinCare;

	public SampleOOPS() {

	}

	public String getCare() {
		return care;
	}

	public void setCare(String care) {
		this.care = care;
	}

	public String getExercise() {
		return exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
	}

	public String getMeditation() {
		return meditation;
	}

	public void setMeditation(String meditation) {
		this.meditation = meditation;
	}

	public String getSkinCare() {
		return skinCare;
	}

	public void setSkinCare(String skinCare) {
		this.skinCare = skinCare;
	}

	public void consistency() {
		System.out.println("Consistency is the key to success, no shortcut on this");
	}

	public static void main(String[] args) {

		SampleOOPS sp = new SampleOOPS();
		sp.setSkinCare("daily perform basic cleaning");
		sp.setExercise("gives health");
		sp.setMeditation("inner peace is important");

		sp.consistency();
		System.out.println(sp.getMeditation());

	}
}
