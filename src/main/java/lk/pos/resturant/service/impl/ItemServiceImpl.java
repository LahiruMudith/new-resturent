package lk.pos.resturant.service.impl;

import lk.pos.resturant.entity.Item;
import lk.pos.resturant.repository.ItemRepository;
import lk.pos.resturant.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

    @RequiredArgsConstructor
@Service
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;
    @Override
    public List<Item> getAllItems() {
       return itemRepository.findAll();
    }
}
