package com.achref.javalabs.client.entities;

import java.io.Serializable;

public class Person  implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 2266308568934758127L;
	private long idPersonne ; 
	private String name ; 
	private String familyName ; 
	private String adress ; 
	private String mail ; 
	private String phone ;
	public Person() {
	}
	public long getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(long idPersonne) {
		this.idPersonne = idPersonne;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	} 

	
	
	
	
}
