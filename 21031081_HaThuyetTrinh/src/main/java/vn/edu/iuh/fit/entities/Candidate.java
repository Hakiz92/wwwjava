package vn.edu.iuh.fit.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long canId;
    private String fullName;
    private String email;
    private String phone;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dob;

    @ManyToOne(cascade = CascadeType.ALL)  // Thêm CascadeType.ALL để tự động lưu Address khi lưu Candidate
    @JoinColumn(name = "address_id")
    private Address address;

    // getters and setters

	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCanId() {
		return canId;
	}

	public void setCanId(Long canId) {
		this.canId = canId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Candidate [canId=" + canId + ", fullName=" + fullName + ", email=" + email + ", phone=" + phone
				+ ", dob=" + dob + ", address=" + address + "]";
	}
    
    
}