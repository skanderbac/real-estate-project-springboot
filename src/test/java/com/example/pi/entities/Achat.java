package com.example.pi.entities;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
@Entity
@Table (name = "Achat")
public class Achat implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7135471761468034435L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String titre; 
	private String description; 
	@Temporal(TemporalType.DATE)
	private Date date;
	
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
 
	
}
