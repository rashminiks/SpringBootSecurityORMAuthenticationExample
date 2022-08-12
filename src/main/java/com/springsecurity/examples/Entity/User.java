package com.springsecurity.examples.Entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="userstab")
public class User {
	
	@Id
	@Column(name="Uid")
	@GeneratedValue
	private Integer uid;
	@Column(name="Uname")
	private String name;
	@Column(name="Email")
	private String email;
	@Column(name="Pwd")
	private String pwd;
	
	@ElementCollection
	@CollectionTable(name="rolestab",
	joinColumns=@JoinColumn(name="Uid"))
	@Column(name="role")
	private List<String> roles;
	

}
