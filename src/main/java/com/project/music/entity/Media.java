package com.project.music.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Media {
	@Id
	@Column
	private long id;
	
	@Column
	@NotNull(message="{NotNull.Media.name}")
	private String name;
	
	@Column
	@NotNull(message="{NotNull.Media.description}")
	private String description;
	
	@Column
	@NotNull(message="{NotNull.Media.source}")
	private String source;
	
	@Column
	@NotNull(message="{NotNull.Media.audio}")
	private String audio;
	
	@Column
	@NotNull(message="{NotNull.Media.image}")
	private String image;
	
	@Column
	@NotNull(message="{NotNull.Media.title}")
	private String title;
}
