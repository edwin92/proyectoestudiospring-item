package com.apisew.item.models.service;

import java.util.List;

import com.apisew.item.models.Item;

public interface ItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
	
}
