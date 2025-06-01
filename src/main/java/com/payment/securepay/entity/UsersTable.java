package com.payment.securepay.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users", schema = "PAYMENTS_DB")
public class UsersTable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	// Adjust this for your DB (Oracle may use IDENTITY or SEQUENCE)
	public long id;
	@Column(name ="username")
	public String userName;
	@Column(name="password")
	public String password;
}
