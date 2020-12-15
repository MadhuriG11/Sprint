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
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Customer {
private String name;
private String address;
private long contact;
private int loan_id;
private String type_of_loan;
private long income;
@Id 
@GeneratedValue(strategy=GenerationType.AUTO)
 private long cust_id;


public int getLoan_id() {
	return loan_id;
}
public void setLoan_id(int loan_id) {
	this.loan_id = loan_id;
}
@ManyToOne
private Admin admin1;


@OneToMany(mappedBy = "cust1",cascade = CascadeType.ALL,fetch=FetchType.LAZY)
private List<LAD> ld1;




public Admin getAdmin1() {
	return admin1;
}
public void setAdmin1(Admin admin1) {
	this.admin1 = admin1;
}
public List<LAD> getLd1() {
	return ld1;
}
public void setLd1(List<LAD> ld1) {
	this.ld1 = ld1;
}
private long acc_no;


public String getName() {
	return name;
}
public long getCust_id() {
	return cust_id;
}
public void setCust_id(long cust_id) {
	this.cust_id = cust_id;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
public String getType_of_loan() {
	return type_of_loan;
}
public void setType_of_loan(String type_of_loan) {
	this.type_of_loan = type_of_loan;
}
public long getIncome() {
	return income;
}
public void setIncome(long income) {
	this.income = income;
}
public long getAcc_no() {
	return acc_no;
}
public void setAcc_no(long acc_no) {
	this.acc_no = acc_no;
}

}
