package com.stockproject.stockmanagementsystem.repository;

import com.stockproject.stockmanagementsystem.model.ItemStock;
import org.springframework.data.repository.CrudRepository;

public interface ItemStockRepository extends CrudRepository<ItemStock, Long> {}
