package com.reljicd.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import java.math.BigDecimal;

@Entity
@Table(name = "PG")
public class Pg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;



    @Column(name = "occupation")
    private String occupation;
    
    @Column(name = "address")
    private String address;


	@Column(name = "phoneNo", nullable = true)
//	@Length(min = "10" message = "*Name must have at least 5 characters")

    private Integer phoneNo;

    @Column(name = "parentsNo", nullable = true)
  //  @DecimalMin(value = "0.00", message = "Phone no must have 10 digit")
    private Integer parentsNo;
    
    @Column(name = "adharNo", nullable = true)
   // @DecimalMin(value = "0.00", message = "aadhar no must have 12 digit")
    private Integer adharNo;
    
    @Column(name = "roomNo", nullable = true)
 //   @DecimalMin(value = "0.00", message = "Phone no must have 3 digit")
    private Integer roomNo;




	@Column(name = "email", unique = true, nullable = false)
    @Email(message = "*Please provide a valid Email")
    @NotEmpty(message = "*Please provide an email")
    private String email;



    @Column(name = "username", nullable = false, unique = true)
    @Length(min = 5, message = "*Your username must have at least 5 characters")
    @NotEmpty(message = "*Please provide your name")
    private String username;
    
    public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}






    
    public Integer getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Integer getParentsNo() {
		return parentsNo;
	}

	public void setParentsNo(Integer parentsNo) {
		this.parentsNo = parentsNo;
	}

	public Integer getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(Integer adharNo) {
		this.adharNo = adharNo;
	}

	public Integer getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(Integer roomNo) {
		this.roomNo = roomNo;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pg product = (Pg) o;

        return id.equals(product.id);
    }



    
}
