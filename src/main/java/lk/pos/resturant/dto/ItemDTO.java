package lk.pos.resturant.dto;

import jakarta.persistence.Id;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {
    @Id
    private String iId;
    private String description;
    private int qty;
    private double price;
}
