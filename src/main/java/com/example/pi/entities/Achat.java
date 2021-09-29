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
	@Column(name="status")
	private String status;
	@Column(name="description")
	private String description; 
	@Column(name="date")
	@Temporal(TemporalType.DATE)
	private Date date;
	@Column(name="bedrooms")
	private int bedrooms;
	@Column(name="garage")
	private int garage;
	@Column(name="elevator")
	private boolean elevator;
	@Column(name="bathrooms")
	private int bathrooms;
	@Column(name="type")
	private String type;
	@Column(name="areas")
	private int areas;
	@Column(name="pool")
	private boolean pool;
	@Column(name="price")
	private double price;
	@Column(name="photo")
	private String photo;
	@Column(name="ac")
	private boolean ac;
	@Column(name="internet")
	private boolean internet;
	@Column(name="parking")
	private boolean parking;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private String phone;
	@Column(name="age")
	private String age;
	@Column(name="address")
	private String address;
	@Column(name="city")
	private String city;
	
	public Achat() {
		super();
	}

	public Achat(int id, String titre, String status, String description, Date date, int bedrooms, int garage,
			boolean elevator, int bathrooms, String type, int areas, boolean pool, double price, String photo,
			boolean ac, boolean internet, boolean parking, String name, String email, String phone, String age, String address, String city) {
		super();
		this.id = id;
		this.titre = titre;
		this.status = status;
		this.description = description;
		this.date = date;
		this.bedrooms = bedrooms;
		this.garage = garage;
		this.elevator = elevator;
		this.bathrooms = bathrooms;
		this.type = type;
		this.areas = areas;
		this.pool = pool;
		this.price = price;
		this.photo = photo;
		this.ac = ac;
		this.internet = internet;
		this.parking = parking;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.address = address;
		this.city = city;
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



	public int getBedrooms() {
		return bedrooms;
	}



	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}



	public int getGarage() {
		return garage;
	}



	public void setGarage(int garage) {
		this.garage = garage;
	}



	public boolean isElevator() {
		return elevator;
	}



	public void setElevator(boolean elevator) {
		this.elevator = elevator;
	}



	public int getBathrooms() {
		return bathrooms;
	}



	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getAreas() {
		return areas;
	}



	public void setAreas(int areas) {
		this.areas = areas;
	}



	public boolean isPool() {
		return pool;
	}



	public void setPool(boolean pool) {
		this.pool = pool;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getPhoto() {
		return photo;
	}



	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public boolean isInternet() {
		return internet;
	}

	public void setInternet(boolean internet) {
		this.internet = internet;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	
	
}
