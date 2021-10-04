package am.aca.generactive.generactive.service.mapper;

import am.aca.generactive.generactive.model.Item;
import am.aca.generactive.generactive.service.itemdto.ItemDTO;
import am.aca.generactive.generactive.service.itemdto.ItemDetailsDTO;
import org.modelmapper.ModelMapper;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ItemDTOMapper {
    public static List<ItemDTO> mapToDTOs(Collection<? extends Item> entities) {
        if (CollectionUtils.isEmpty(entities)) {
            return new ArrayList<>();
        }

        List<ItemDTO> rv = new ArrayList<>();

        for (Item entity : entities) {
            rv.add(mapToDTO(entity).orElse(null));
        }

        return rv;
    }


    public static Optional<ItemDTO> mapToDTO(Item entity) {
        if (entity == null) {
            return Optional.empty();
        }
        ModelMapper modelMapper = new ModelMapper();
        ItemDTO itemDTO = modelMapper.map(entity, ItemDTO.class);

        return Optional.of(itemDTO);
    }

    public static Item mapToEntity(ItemDTO dto) {
        if (dto == null) {
            return null;
        }
        Item entity = new Item();
        entity.setName(dto.getName());
        entity.setBasePrice(dto.getBasePrice());
        entity.setItemDetail(ItemDetailsDTO.mapToEntity(dto.getItemDetails()));

        return entity;
    }
}
