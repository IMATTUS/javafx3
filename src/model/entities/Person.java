package model.entities;

import java.io.Serializable;

public class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String email;
	private Integer id;
	public Person() {}
	public Person(Integer id, String name, String email) {
		this.name = name;
		this.email = email;
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", id=" + id + "]";
	}
	
}
