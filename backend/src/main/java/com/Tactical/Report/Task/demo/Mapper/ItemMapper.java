package com.Tactical.Report.Task.demo.Mapper;

import com.Tactical.Report.Task.demo.DTO.ItemDTO;
import com.Tactical.Report.Task.demo.model.ItemEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    ItemDTO itemToItemDTO(ItemEntity itemEntity);
    ItemEntity itemDTOToItem(ItemDTO itemDTO);
}
