package com.abcloan;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Admin  {
private String name;
private String status;
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Id
private int loan_id;
@ManyToOne
Customer cust;




@OneToMany(mappedBy = "admin2",cascade = CascadeType.ALL,fetch=FetchType.LAZY)
private List<LAD> ld2;

@ManyToOne
private Admin admin1;




public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getLoan_id() {
	return loan_id;
}
public void setLoan_id(int loan_id) {
	this.loan_id = loan_id;
}

}
