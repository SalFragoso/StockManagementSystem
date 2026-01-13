package com.stockproject.stockmanagementsystem.Controllers;

import com.stockproject.stockmanagementsystem.model.ItemStock;
import com.stockproject.stockmanagementsystem.repository.ItemStockRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/items")
public class ItemStockController {

    private final ItemStockRepository repository;

    public ItemStockController(ItemStockRepository repository) {

        this.repository = repository;
    }

    //Create
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ItemStock createItem(@RequestBody ItemStock item){

        return repository.save(item);
    }

    //Read
    @GetMapping
    public Iterable<ItemStock> getAllItems() { //Enhanced for loop from "Iterable"

        return repository.findAll();
    }

}
