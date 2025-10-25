package com.Tactical.Report.Task.demo.repository;

import com.Tactical.Report.Task.demo.model.ItemEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<ItemEntity, String> {
}
