package com.example.pi.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Achat")
public class Achat implements Serializable {


	private static final long serialVersionUID = -1741519260556429015L;
	@Column(name="id")
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="titre")
	private String titre; 
	@Column(name="description")
	private String description; 
	@Column(name="date")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	public Achat() {
		super();
	}
	
	public Achat(int id, String titre, String description, Date date) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.date = date;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
}
