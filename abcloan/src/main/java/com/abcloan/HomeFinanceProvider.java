package com.abcloan;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity

public class HomeFinanceProvider extends Admin {

	
private String typeofloan;
private double rate_of_interest;
private double income;
private int duration;
public String getTypeofloan() {
	return typeofloan;
}
public void setTypeofloan(String typeofloan) {
	this.typeofloan = typeofloan;
}
public double getRate_of_interest() {
	return rate_of_interest;
}
public void setRate_of_interest(double rate_of_interest) {
	this.rate_of_interest = rate_of_interest;
}
public double getIncome() {
	return income;
}
public void setIncome(double income) {
	this.income = income;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
}
