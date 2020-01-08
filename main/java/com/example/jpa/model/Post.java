package com.example.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.springframework.lang.NonNull;

@Entity
@Table(name="posts")
public class Post extends AuditModel{
	
	@Id
	@GeneratedValue
	private long id;
	
	@NonNull
	@Size(max=60)
	@Column(unique=true)
	private String title;
	
	@NotNull
	@Size(max=60)
	private String description;
	
	@NotNull
	@Lob
	@Type(type="org.hibernate.type.TextType")
	private String content;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	

}
