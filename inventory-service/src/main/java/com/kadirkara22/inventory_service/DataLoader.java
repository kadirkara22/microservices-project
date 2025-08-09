package com.kadirkara22.inventory_service;

import com.kadirkara22.inventory_service.model.Inventory;
import com.kadirkara22.inventory_service.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final InventoryRepository inventoryRepository;

    public DataLoader(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Inventory inventory = new Inventory();
        inventory.setSkuCode("iphone_16");
        inventory.setQuantity(50);

        Inventory inventory2 = new Inventory();
        inventory2.setSkuCode("iphone_16_plus");
        inventory2.setQuantity(0);

        inventoryRepository.save(inventory);
        inventoryRepository.save(inventory2);

        System.out.println("Sample Inventory saved!");
    }
}
