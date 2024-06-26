package lk.pos.resturant.repository;

import lk.pos.resturant.dto.ItemDTO;
import lk.pos.resturant.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ItemRepository extends JpaRepository<Item, String> {

}
