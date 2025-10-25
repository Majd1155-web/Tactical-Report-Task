package com.Tactical.Report.Task.demo.controller;

import com.Tactical.Report.Task.demo.DTO.ItemDTO;
import com.Tactical.Report.Task.demo.helperClasses.ApiResponse;
import com.Tactical.Report.Task.demo.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse createItem(@Valid @RequestBody ItemDTO itemDTO) {
        ItemDTO createdItem = itemService.createItem(itemDTO);
        return new ApiResponse(true, "Item created successfully", createdItem);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse getAllItems() {
        List<ItemDTO> items = itemService.getAllItems();
        return new ApiResponse(true, "Items retrieved successfully", items);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse getItemById(@PathVariable String id) {
        ItemDTO item = itemService.getItemById(id);
        return new ApiResponse(true, "Item retrieved successfully", item);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse updateItem(@PathVariable String id, @Valid @RequestBody ItemDTO itemDTO) {
        ItemDTO updatedItem = itemService.updateItem(id, itemDTO);
        return new ApiResponse(true, "Item updated successfully", updatedItem);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse deleteItem(@PathVariable String id) {
        itemService.deleteItem(id);
        return new ApiResponse(true, "Item deleted successfully");
    }
}
