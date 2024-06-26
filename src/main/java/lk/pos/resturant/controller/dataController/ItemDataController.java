package lk.pos.resturant.controller.dataController;

import lk.pos.resturant.entity.Item;
import lk.pos.resturant.service.ItemService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
public class ItemDataController {
    public static ItemService itemService;

    public ItemDataController(ItemService itemService) {
        this.itemService = itemService;
    }

    public static List<Item> getAllItems(){
        return itemService.getAllItems();
    }
}
