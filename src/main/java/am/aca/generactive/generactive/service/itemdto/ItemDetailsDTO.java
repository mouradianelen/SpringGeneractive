package am.aca.generactive.generactive.service.itemdto;


import am.aca.generactive.generactive.model.Item;
import am.aca.generactive.generactive.model.ItemDetails;

import java.util.Objects;

public class ItemDetailsDTO {
    private Long id;
    private String description;


    public static ItemDetailsDTO mapToDTO(ItemDetails entity) {
        if (entity == null) {
            return null;
        }

        ItemDetailsDTO dto = new ItemDetailsDTO();
        dto.setId(entity.getId());
        dto.setDescription(entity.getDescription());

        return dto;
    }

    public static ItemDetails mapToEntity(ItemDetailsDTO itemDetails) {
        return null;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemDetailsDTO that = (ItemDetailsDTO) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
