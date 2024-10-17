package com.tns.project.service;

import java.util.List;

import com.tns.project.entity.Shop;

public interface ShopService {
	public Shop saveShop(Shop shop);

	public List<Shop> fetchShopList();

	public Shop fetchShopById(Long shopId);

	public void deleteShopById(Long shopId);

	public Shop updateShop(Long shopId, Shop shop);

}
