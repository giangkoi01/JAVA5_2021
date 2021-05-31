package io.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


/**
 * The persistent class for the product database table.
 * 
 */
@Data
@Entity
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Integer avaiable;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	private String image;

	private String name;

	private Double price;

	private Integer quantity;

	//bi-directional many-to-one association to Category
	@ManyToOne
	private Category category;

}