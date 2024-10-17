package com.tns.project.service;

import java.util.List;

import com.tns.project.entity.Item;

public interface ItemService {

	Item saveItem(Item item);

	List<Item> fetchItemList();

	Item fetchItemById(Long itemId);

	void deleteItemById(Long itemId);

	Item updateItem(Long itemId, Item item);

}
