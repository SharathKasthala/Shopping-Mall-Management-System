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

import com.tns.project.entity.Shop;
import com.tns.project.service.ShopService;

@RestController
public class ShopCtrl {
	@Autowired
	private ShopService shopService;
	
	@PostMapping("/shopvalue")
	public Shop saveShop(@RequestBody Shop shop) {
		return shopService.saveShop(shop);
	}
	
	@GetMapping("/shopvalue")
	public List<Shop> fetchShopList() {
        //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return shopService.fetchShopList();
    }
    
	@GetMapping("/shopvalue/{id}")
	public Shop fetchShopById(@PathVariable("id") Long shopId)
    {
		return shopService.fetchShopById(shopId);
    }

	@DeleteMapping("/shopvalue/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long shopId) {
        shopService.deleteShopById(shopId);
        return "The shop is deleted. Renew if needed.";
    }
    
    @PutMapping("/shopvalue/{id}")
    public Shop updateShop(@PathVariable("id") Long shopId,
                                       @RequestBody Shop shop) {
        return shopService.updateShop(shopId,shop);
    }

}
