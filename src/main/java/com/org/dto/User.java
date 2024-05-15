package com.org.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

@Entity

public class User {
	@Id
		private int id;
		private String Name;
		private int age;
		private int mobile;
		private int email;
		private int password;
		@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch =FetchType.LAZY )
		private List<Note> notes;
}
