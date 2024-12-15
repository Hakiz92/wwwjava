package vn.edu.iuh.fit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addId;
    private Integer country;
    private String zipcode;
    private String number;
    private String city;
    private String street;
    
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(Long addId, Integer country, String zipcode, String number, String city, String street) {
		super();
		this.addId = addId;
		this.country = country;
		this.zipcode = zipcode;
		this.number = number;
		this.city = city;
		this.street = street;
	}

	public Long getAddId() {
		return addId;
	}

	public void setAddId(Long addId) {
		this.addId = addId;
	}

	public Integer getCountry() {
		return country;
	}

	public void setCountry(Integer country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
    
    
    // getters and setters
	
}