package com.abcloan;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class LAD {

@Id //@GeneratedValue(strategy=GenerationType.AUTO)
private int lad_id;
private String status;


public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
private String password;

public Customer getCust1() {
	return cust1;
}
public void setCust1(Customer cust1) {
	this.cust1 = cust1;
}
public Admin getAdmin2() {
	return admin2;
}
public void setAdmin2(Admin admin2) {
	this.admin2 = admin2;
}
@ManyToOne
@JoinColumn(name="cust1")
private Customer cust1;


@ManyToOne
private Admin admin2;




//@JoinColumn(name = "loan_id", referencedColumnName = "loan_id")
//private List<Admin> admin;

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getLad_id() {
	return lad_id;
}
public void setLad_id(int lad_id) {
	this.lad_id = lad_id;

	// TODO Auto-generated method stub
	
}

}
