package com.fungiblestory.writer.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//Master Table

@Entity
@Table(name = "Country")
public class Country implements Serializable {

	private static final long serialVersionUID = -5110542220243550956L;

	@Column(name = "CountryId", updatable = false, nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long CountryId;

	@Column(name = "Country", updatable = false, nullable = false)
	private String Country;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "country")
	private User user;

	public Long getCountryId() {
		return CountryId;
	}

	public void setCountryId(Long countryId) {
		CountryId = countryId;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Country [CountryId=" + CountryId + ", Country=" + Country + ", user=" + user + "]";
	}
}
