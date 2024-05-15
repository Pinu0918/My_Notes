package com.org.dto;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Note {
	@Id
	private int id;
	private String title;
	private String description;
	@ManyToOne
	@JoinColumn
	private User user;
}
