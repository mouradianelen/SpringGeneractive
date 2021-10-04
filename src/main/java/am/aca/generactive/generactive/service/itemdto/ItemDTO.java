package am.aca.generactive.generactive.service.itemdto;


import javax.validation.constraints.*;
import java.util.Objects;
import java.util.Optional;

import java.util.Objects;

public class ItemDTO {
    @NotBlank(message = "name must not be blank")
    private String name;
    private Long id;
    @PositiveOrZero
    @Min(value = 10)
    @Max(value = 1000)
    private Integer basePrice;
    @NotNull
    private ItemDetailsDTO itemDetails;
    private String groupName;


    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
    }

    public ItemDetailsDTO getItemDetails() {
        return itemDetails;
    }

    public Integer getBasePrice() {
        return basePrice;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setItemDetails(ItemDetailsDTO itemDetails) {
        this.itemDetails = itemDetails;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", basePrice=" + basePrice +
                ", itemDetails=" + itemDetails +
                ", groupName='" + groupName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemDTO itemDTO = (ItemDTO) o;
        return Objects.equals(id, itemDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
