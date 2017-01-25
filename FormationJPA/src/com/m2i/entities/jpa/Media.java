package com.m2i.entities.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the media database table.
 * 
 */
@Entity
@NamedQuery(name="Media.findAll", query="SELECT m FROM Media m")
public class Media implements Serializable, IEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String isbn;

	private Integer nbpage;

	@Column(name="\"nbTrack\"")
	private Integer nbTrack;

	private double price;

	private String title;

	private Integer type;

	//bi-directional many-to-many association to Author
	@ManyToMany
	@JoinTable(
		name="bookauthor"
		, joinColumns={
			@JoinColumn(name="bookid")
			}
		, inverseJoinColumns={
			@JoinColumn(name="authorid")
			}
		)
	private List<Author> authors;

	//bi-directional many-to-one association to Publisher
	@ManyToOne
	@JoinColumn(name="publisherid")
	private Publisher publisher;

	public Media() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getNbpage() {
		return this.nbpage;
	}

	public void setNbpage(Integer nbpage) {
		this.nbpage = nbpage;
	}

	public Integer getNbTrack() {
		return this.nbTrack;
	}

	public void setNbTrack(Integer nbTrack) {
		this.nbTrack = nbTrack;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public List<Author> getAuthors() {
		return this.authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public Publisher getPublisher() {
		return this.publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

}