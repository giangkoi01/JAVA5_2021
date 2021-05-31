package io.spring.entities;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;


/**
 * The persistent class for the account database table.
 * 
 */
@Data
@Entity(name = "Account")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String username;
	
	private Boolean active;
	private Boolean admin;
	private String password;

}