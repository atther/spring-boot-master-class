package com.in28minutes.learning.jpa.jpain10steps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//Table - User
// "User" is a reserved keyword in H2 database hence changed the table name to "USER_DETAILS"
// shouldn't be used it as table name or column either.
@Entity
@Table(name = "USER_DETAILS")
public class User {

	@Id
	@GeneratedValue
	private long id;

	private String name;

	private String role;

	protected User() {

	}

	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return String.format("User [id=%s, name=%s, role=%s]", id, name, role);
	}
}
