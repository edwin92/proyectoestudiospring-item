package com.apisew.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apisew.item.models.Item;
import com.apisew.item.models.service.ItemService;

@RestController
@RequestMapping("api")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/listar")
	public List<Item> listar() {
		return itemService.findAll();
	}
	
	@GetMapping("/ver/{id}/cantidad/{cantidad}")
	public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
		return itemService.findById(id, cantidad);
	}

}
