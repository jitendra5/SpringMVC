package com.springlearning.studentcontroller;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Address {
@Size(min=2,max=30)
private String street;
@NotNull
private String city;

private long pin;
@NotNull
private String country;
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public long getPin() {
	return pin;
}
public void setPin(long pin) {
	this.pin = pin;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}
