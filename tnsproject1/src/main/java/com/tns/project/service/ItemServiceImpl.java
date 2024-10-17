package com.tns.project.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.project.entity.Item;
import com.tns.project.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	ItemRepository itemRepository;

	@Override
	public Item saveItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepository.save(item);
	}

	@Override
	public List<Item> fetchItemList() {
		// TODO Auto-generated method stub
		return itemRepository.findAll();
	}

	@Override
	public Item fetchItemById(Long itemId) {
		// TODO Auto-generated method stub
		return itemRepository.findById(itemId).get();
	}

	@Override
	public void deleteItemById(Long itemId) {
		// TODO Auto-generated method stub
		itemRepository.deleteById(itemId);
	}

	@Override
	public Item updateItem(Long itemId, Item item) {
		// TODO Auto-generated method stub
		Item itemDB = itemRepository.findById(itemId).get();
		if(Objects.nonNull(item.getItemName())&&!"".equalsIgnoreCase(item.getItemName())) {
			itemDB.setItemName(item.getItemName());
		}
		if(Objects.nonNull(item.getPrice())&&!"".equalsIgnoreCase(item.getItemName())) {
			itemDB.setPrice(item.getPrice());
		}
		
		return itemRepository.save(itemDB);
	}

}
