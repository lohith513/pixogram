package com.cts.training.coll;

public class Comparision implements Comparable<Comparision>{
	private int id;
	private String name;
	private String email;
	
	
	
	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	public Comparision() {
		
	}
	
	public Comparision(int id, String name, String email) {
		
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int compareTo(Comparision other) {
		// TODO Auto-generated method stub
		return this.id - other.id;
	}

	@Override
	public int compareTo(Comparision arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}