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
@Table(name = "Story")
public class Story implements Serializable {

	private static final long serialVersionUID = -1203682290468017755L;

	@Id
	@Column(name = "StoryId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long StoryId;

	@Column(name = "StoryTitle")
	private String StoryTitle;

	@Column(name = "StoryGenre")
	private int StoryGenre;

	@Column(name = "StoryContent", columnDefinition = "TEXT")
	private String Content;

	@CreationTimestamp
	@Column(name = "CreatedAt", nullable = false, updatable = false)
	private Date CreatedAt;

	@CreationTimestamp
	@Column(name = "UpdatedAt", nullable = false, updatable = false)
	private Date UpdatedAt;

	public long getStoryId() {
		return StoryId;
	}

	public void setStoryID(long storyId) {
		StoryId = storyId;
	}

	public String getStoryTitle() {
		return StoryTitle;
	}

	public void setStoryTitle(String storyTitle) {
		StoryTitle = storyTitle;
	}

	public int getStoryGenre() {
		return StoryGenre;
	}

	public void setStoryGenre(int storyGenre) {
		StoryGenre = storyGenre;
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
		return "Story [StoryID=" + StoryId + ", StoryTitle=" + StoryTitle + ", StoryGenre=" + StoryGenre + ", Content="
				+ Content + ", CreatedAt=" + CreatedAt + ", UpdatedAt=" + UpdatedAt + "]";
	}
}
