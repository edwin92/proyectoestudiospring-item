package com.apisew.item.models;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Producto implements Serializable {

	private Long id;
	private String nombre;
	private Double precio;
	private Date createAt;
	
	private static final long serialVersionUID = -6838802470159416320L;

}
