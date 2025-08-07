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
        inventory.setSkuCode("SKU124");
        inventory.setQuantity(50);
        inventoryRepository.save(inventory);

        System.out.println("Sample Inventory saved!");
    }
}
