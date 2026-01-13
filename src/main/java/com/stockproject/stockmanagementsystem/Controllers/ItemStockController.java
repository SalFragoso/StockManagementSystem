package com.stockproject.stockmanagementsystem.Controllers;

import com.stockproject.stockmanagementsystem.Exceptions.ItemNotFound;
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

    //Read All Items
    @GetMapping
    public Iterable<ItemStock> getAllItems() { //Enhanced for loop from "Iterable"

        return repository.findAll();
    }

    //Read by ID
    @GetMapping("{id}")
    public ItemStock getItem(@PathVariable long id) {

        return repository.findById(id)
                .orElseThrow(() -> new ItemNotFound(id)); //Incase id does not exist returns 404
    }


}
