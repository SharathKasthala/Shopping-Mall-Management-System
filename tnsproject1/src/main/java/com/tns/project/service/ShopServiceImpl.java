package com.tns.project.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.project.entity.Shop;
import com.tns.project.repository.ShopRepo;
@Service
public class ShopServiceImpl implements ShopService{
	@Autowired
	private ShopRepo shopRepo;
	
	@Override
	public Shop saveShop(Shop shop) {
		return shopRepo.save(shop);
		
	}
	@Override
    public List<Shop> fetchShopList() {
        return shopRepo.findAll();
    }

   @Override
   public Shop fetchShopById(Long shopId) {
	   return shopRepo.findById(shopId).get();
   }
	
   @Override
   public void deleteShopById(Long shopId) {
	   shopRepo.deleteById(shopId);
   }


   @Override
   public Shop updateShop(Long shopId, Shop shop) {
	   Shop shopDB = shopRepo.findById(shopId).get();

       if(Objects.nonNull(shop.getShopName()) &&
       !"".equalsIgnoreCase(shop.getShopName())) {
    	   shopDB.setShopName(shop.getShopName());
       }

       if(Objects.nonNull(shop.getLeaseStatus()))
       {
    	   shopDB.setLeaseStatus(shop.getLeaseStatus());
       }

       

       return shopRepo.save(shopDB);
   }

}
