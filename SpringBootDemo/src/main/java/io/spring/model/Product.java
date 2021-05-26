package io.spring.model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Create Product model to show .........
 * @author FPT-HUYPN6
 *
 */
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	//Blank = Empty + Null
	@NotBlank
	@Length(min = 5, max = 50)
	private String name;
	
	@NotBlank
	private String description;
	
	private Double price;

}