package com.apisew.item.models.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.apisew.item.models.Item;
import com.apisew.item.models.Producto;

@Service
public class ItemServiceImp implements ItemService {

	@Autowired
	private RestTemplate clienteRest;
	
	@Override
	public List<Item> findAll() {
		try {
			List<Producto> productos = Arrays.asList(clienteRest.getForObject("http://localhost:8001/api/listar", Producto[].class));
			System.out.println(productos);
			return productos.stream()
					.map(producto -> new Item( producto, 1))
					.collect(Collectors.toList());
		} catch (Exception e) {
			System.err.println("Esto es un error");
			System.err.println(e.getMessage());
			return null;
		}
		
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", id.toString());
		Producto producto = clienteRest.getForObject( "http://localhost:8001/api/ver/{id}", Producto.class, pathVariables);
		return new Item(producto, cantidad);
	}

}
