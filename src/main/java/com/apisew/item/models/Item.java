package com.apisew.item.models;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Item {

	private Producto producto;
	private Integer cantidad;
	
	
	public Double getTotal() {
		return producto.getPrecio() * cantidad.doubleValue();
	}
}
