package com.example.databasedemo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    // Insert Data (POST)
    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    // Get Data (GET)
    @GetMapping
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
}