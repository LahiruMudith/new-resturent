package lk.pos.resturant.controller;

import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import lk.pos.resturant.controller.dataController.ItemDataController;
import lk.pos.resturant.entity.Item;
import lk.pos.resturant.service.ItemService;
import lk.pos.resturant.tm.Description;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class EntreeSnacksPagePageController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private MFXButton txtOpenPrice;

    @FXML
    void openPrice(ActionEvent event) {

    }

    @FXML
    public void btnBowlOfFries(javafx.scene.input.MouseEvent mouseEvent) {
        ItemDataController.getAllItems();
    }
}
