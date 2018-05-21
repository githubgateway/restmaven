//package com.hackathon.restapi.restservices.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="testuser",catalog="3rdi_namita")
//public class UserEntity {
//	
//	public UserEntity(){
//		
//	}
//	/* for auto incremented id field
//	 * @Id
//	private int Id;
//	*/
//	/*
//	 * if column name is not same variable name
//	 * @column(name="Id")
//	 * private int jpaId;
//	 */
//	@Id
//	@GeneratedValue
//	@Column(name="Id")
//	private int Id;
//	
//	public int getId() {
//		return Id;
//	}
//	public void setId(int id) {
//		Id = id;
//	}
//	@Column(name = "userid", nullable = false)
//	private String UserId;
//	public String getUserId() {
//		return UserId;
//	}
//	public void setUserId(String userId) {
//		UserId = userId;
//	}
//	public String getPassword() {
//		return Password;
//	}
//	public void setPassword(String password) {
//		Password = password;
//	}
//	@Column(name = "password")
//	private String Password;
//}
