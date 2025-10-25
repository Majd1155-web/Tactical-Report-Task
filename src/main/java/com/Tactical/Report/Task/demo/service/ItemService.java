package com.Tactical.Report.Task.demo.service;

import com.Tactical.Report.Task.demo.DTO.ItemDTO;
import com.Tactical.Report.Task.demo.model.ItemEntity;

import java.util.List;

public interface ItemService {

    ItemDTO createItem(ItemDTO itemDTO);

    List<ItemDTO> getAllItems();

    ItemDTO getItemById(String id);

    ItemDTO updateItem(String id, ItemDTO itemDetails);

    void deleteItem(String id);
}
