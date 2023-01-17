package com.fungiblestory.writer.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "StoryGenre")
public class StoryGenre implements Serializable {

	private static final long serialVersionUID = -3970901368722902580L;

	@Column(name = "StoryGenreId")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long StoryGenreId;

	@Column(name = "StoryTitle")
	private String StoryTitle;

	@Column(name = "Content")
	private String Content;

	@Column(name = "CreatedAt")
	@CreationTimestamp
	private Date CreatedAt;

	@Column(name = "UpdatedAt")
	@CreationTimestamp
	private Date UpdatedAt;
	
	public Long getStoryGenreId() {
		return StoryGenreId;
	}

	public void setStoryGenreId(Long storyGenreId) {
		StoryGenreId = storyGenreId;
	}

	public String getStoryTitle() {
		return StoryTitle;
	}

	public void setStoryTitle(String storyTitle) {
		StoryTitle = storyTitle;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
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
		return "StoryGenre [StoryGenreId=" + StoryGenreId + ", StoryTitle=" + StoryTitle + ", Content=" + Content
				+ ", CreatedAt=" + CreatedAt + ", UpdatedAt=" + UpdatedAt + "]";
	}

}
