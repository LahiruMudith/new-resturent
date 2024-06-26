package lk.pos.resturant.service;

import lk.pos.resturant.entity.Item;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ItemService {
    public List<Item> getAllItems();
}
