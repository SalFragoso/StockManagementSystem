package com.stockproject.stockmanagementsystem.Controllers;

import com.stockproject.stockmanagementsystem.Exceptions.ItemNotFound;
import com.stockproject.stockmanagementsystem.model.ItemStock;
import com.stockproject.stockmanagementsystem.repository.ItemStockRepository;
import jakarta.validation.Valid;
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
    public ItemStock createItem(@Valid @RequestBody ItemStock item){

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

    //Update by ID
    @PutMapping("{id}")
    public ItemStock updateItem(@PathVariable Long id, @Valid @RequestBody ItemStock updatedItem) {

        ItemStock existing = repository.findById(id)
                .orElseThrow(() -> new ItemNotFound(id));

        existing.setName(updatedItem.getName());
        existing.setQuantity(updatedItem.getQuantity());
        existing.setPrice(updatedItem.getPrice());

        return repository.save(existing);
    }

    // Delete by ID
    @DeleteMapping("{id}")
    public void deleteItem(@PathVariable Long id) {

        repository.deleteById(id); //Returns nothing and therefore does not need .OrElseThrow
    }
}
