package com.example.spring.RESTfulAPI_DB.RestApi_JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<ItemModel> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemModel> getItemById(@PathVariable Integer id) {
        ItemModel item = itemService.getItemById(id);
        if (item != null) {
            return ResponseEntity.ok(item);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/api/resource")
    public ResponseEntity<ItemModel> createItem(@RequestBody ItemModel item) {
        ItemModel createdItem = itemService.createItem(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdItem);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ItemModel> updateItem(@PathVariable Integer id, @RequestBody ItemModel item) {
        ItemModel updatedItem = itemService.updateItem(id, item);
        if (updatedItem != null) {
            return ResponseEntity.ok(updatedItem);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Integer id) {
        boolean deleted = itemService.deleteItem(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{startId}/{lastId}")
    public ResponseEntity<Void> deleteInBetweenItems(@PathVariable Integer startId, @PathVariable Integer lastId) {
        boolean deleted = itemService.deleteInBetweenItems(startId, lastId);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

