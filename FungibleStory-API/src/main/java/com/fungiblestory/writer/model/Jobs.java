package com.fungiblestory.writer.model;

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
@Table(name="Jobs")
public class Jobs {

	@Column(name="JobId")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long JobId;
	
	@Column(name="JobTitle")
	private String JobTitle;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "UserId")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private User UserId;
	
	@Column(name="JobDescription")
	private String JobDescription;
	
	@Column(name="CreatedAt")
	@CreationTimestamp
	private Date CreatedAt;
	
	@Column(name="UpdatedAt")
	@CreationTimestamp
	private Date UpdatedAt;

	public Long getJobId() {
		return JobId;
	}

	public void setJobId(Long jobId) {
		JobId = jobId;
	}

	public String getJobTitle() {
		return JobTitle;
	}

	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}

	public User getUserId() {
		return UserId;
	}

	public void setUserId(User userId) {
		UserId = userId;
	}

	public String getJobDescription() {
		return JobDescription;
	}

	public void setJobDescription(String jobDescription) {
		JobDescription = jobDescription;
	}

	public Date getCreatedAt() {
		return CreatedAt;
	}

	public void setCreatedAt(Date createdAt) {
		CreatedAt = createdAt;
	}

	public Date getUpdatedAt() {
		return UpdatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		UpdatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Jobs [JobId=" + JobId + ", JobTitle=" + JobTitle + ", UserId=" + UserId + ", JobDescription="
				+ JobDescription + ", CreatedAt=" + CreatedAt + ", UpdatedAt=" + UpdatedAt + "]";
	}
	
	
}
