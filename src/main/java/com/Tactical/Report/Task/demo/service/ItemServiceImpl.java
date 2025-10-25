package com.Tactical.Report.Task.demo.service;

import com.Tactical.Report.Task.demo.DTO.ItemDTO;
import com.Tactical.Report.Task.demo.Mapper.ItemMapper;
import com.Tactical.Report.Task.demo.exception.ItemNotFoundException;
import com.Tactical.Report.Task.demo.model.ItemEntity;
import com.Tactical.Report.Task.demo.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    public ItemServiceImpl(ItemRepository itemRepository, ItemMapper itemMapper) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
    }

    @Override
    public ItemDTO createItem(ItemDTO itemDTO) {
        ItemEntity itemEntity = itemMapper.itemDTOToItem(itemDTO);
        ItemEntity savedEntity = itemRepository.save(itemEntity);
        return itemMapper.itemToItemDTO(savedEntity);
    }

    @Override
    public List<ItemDTO> getAllItems() {
        List<ItemEntity> items = itemRepository.findAll();
        return items.stream()
                .map(itemMapper::itemToItemDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ItemDTO getItemById(String id) {
        ItemEntity itemEntity = itemRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException("Item not found with id: " + id));
        return itemMapper.itemToItemDTO(itemEntity);
    }

    @Override
    public ItemDTO updateItem(String id, ItemDTO itemDetails) {
        ItemEntity existingItem = itemRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException("Item not found with id: " + id));

        existingItem.setName(itemDetails.getName());
        existingItem.setDescription(itemDetails.getDescription());

        ItemEntity updatedEntity = itemRepository.save(existingItem);
        return itemMapper.itemToItemDTO(updatedEntity);
    }

    @Override
    public void deleteItem(String id) {
        itemRepository.deleteById(id);
    }
}
