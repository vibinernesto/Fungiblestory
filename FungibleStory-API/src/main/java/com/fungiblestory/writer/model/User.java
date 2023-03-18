package com.fungiblestory.writer.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Users")
public class User implements Serializable {

	private static final long serialVersionUID = 7895806247431023647L;

	@Column(name = "UserId")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long UserId;

	@Column(name = "FirstName")
	private String FirstName;

	@Column(name = "LastName")
	private String LastName;

	@Column(name = "DisplayName")
	private String DisplayName;

	@Column(name = "UserEmail")
	private String UserEmail;

	@Column(name = "DateOfBirth")
	private String DateOfBirth;

	@Column(name = "Password")
	private String Password;

	@Column(name = "Gender")
	private String Gender;

	@Column(name = "PhoneNumber")
	private String PhoneNumber;

	@Column(name = "isDeleted")
	private boolean isDeleted;

	@Column(name = "UpdatedAt")
	@CreationTimestamp
	private Date UpdatedAt;

	@Column(name = "CreatedAt")
	@CreationTimestamp
	private Date CreatedAt;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "CountryId")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Country country;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "RoleId")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Role role;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, mappedBy = "UserId")
	private Jobs jobs;


	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Long getUserId() {
		return UserId;
	}

	public void setUserId(Long userId) {
		UserId = userId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDisplayName() {
		return DisplayName;
	}

	public void setDisplayName(String displayName) {
		DisplayName = displayName;
	}

	public String getUserEmail() {
		return UserEmail;
	}

	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getUpdatedAt() {
		return UpdatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		UpdatedAt = updatedAt;
	}

	public Date getCreatedAt() {
		return CreatedAt;
	}

	public void setCreatedAt(Date createdAt) {
		CreatedAt = createdAt;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", DisplayName="
				+ DisplayName + ", UserEmail=" + UserEmail + ", DateOfBirth=" + DateOfBirth + ", Password=" + Password
				+ ", Gender=" + Gender + ", PhoneNumber=" + PhoneNumber + ", isDeleted=" + isDeleted + ", UpdatedAt="
				+ UpdatedAt + ", CreatedAt=" + CreatedAt + ", country=" + country + ", role=" + role + "]";
	}

}
