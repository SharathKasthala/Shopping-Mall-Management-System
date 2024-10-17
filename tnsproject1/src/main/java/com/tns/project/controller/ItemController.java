package com.tns.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tns.project.entity.Item;
import com.tns.project.service.ItemService;

@RestController
public class ItemController {
	@Autowired
	ItemService itemService;
	@PostMapping("/items")
	public Item saveItem(@RequestBody Item item) {
		return itemService.saveItem(item);
	}
	@GetMapping("/items")
	public List<Item>fetchItemList(){
		return itemService.fetchItemList();
	}
	@GetMapping("/items/{id}")
	public Item fetchItemById(@PathVariable("id")Long itemId) {
		return itemService.fetchItemById(itemId);
	}
	@DeleteMapping("/items/{id}")
	public String deleteItemById(@PathVariable("id")Long itemId) {
		itemService.deleteItemById(itemId);
		return "Item deleted Successfully...!!!";
	}
	@PutMapping("/items/{id}")
	public Item updateItem(@PathVariable("id")Long itemId,@RequestBody Item item) {
		return itemService.updateItem(itemId,item);
	}
}
