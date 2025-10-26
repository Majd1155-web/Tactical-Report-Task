package com.Tactical.Report.Task.demo.Mapper;

import com.Tactical.Report.Task.demo.DTO.ItemDTO;
import com.Tactical.Report.Task.demo.model.ItemEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-25T03:19:15+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.3.jar, environment: Java 21.0.3 (Oracle Corporation)"
)
@Component
public class ItemMapperImpl implements ItemMapper {

    @Override
    public ItemDTO itemToItemDTO(ItemEntity itemEntity) {
        if ( itemEntity == null ) {
            return null;
        }

        ItemDTO itemDTO = new ItemDTO();

        itemDTO.setId( itemEntity.getId() );
        itemDTO.setName( itemEntity.getName() );
        itemDTO.setDescription( itemEntity.getDescription() );

        return itemDTO;
    }

    @Override
    public ItemEntity itemDTOToItem(ItemDTO itemDTO) {
        if ( itemDTO == null ) {
            return null;
        }

        ItemEntity itemEntity = new ItemEntity();

        itemEntity.setId( itemDTO.getId() );
        itemEntity.setName( itemDTO.getName() );
        itemEntity.setDescription( itemDTO.getDescription() );

        return itemEntity;
    }
}
