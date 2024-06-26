package lk.pos.resturant.controller;

import io.github.palexdev.materialfx.controls.legacy.MFXLegacyTableView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import lk.pos.resturant.ResturantApplication;
import lk.pos.resturant.tm.Description;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuController implements Initializable {
    @FXML
    private Pane Pane;

    @FXML
    private MFXLegacyTableView<Description> tbldescription;

    @FXML
    private TableColumn<?, ?> description;

    @FXML
    private TableColumn<?, ?> price;

    @FXML
    private TableColumn<?, ?> qty;

    @FXML
    void table(ActionEvent event) {
        Description tm = new Description();
        System.out.println(tm.description.get(0));
        System.out.println(tm.qty.get(0));
        System.out.println(tm.price.get(0));

        description.setCellValueFactory(new PropertyValueFactory<>(tm.description.get(0)));
        System.out.println(tm.qty.get(0));
        System.out.println(tm.price.get(0));
    }

    @FXML
    void btnD4(ActionEvent event) {
//        try {
//            Pane load = FXMLLoader.load(ResturantApplication.class.getResource("/view/entreeSnacksPage.fxml"));
//            Pane.getChildren().setAll(load);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    @FXML
    void btnDesserts(ActionEvent event) {
//        try {
//            Pane load = FXMLLoader.load(ResturantApplication.class.getResource("/view/entreeSnacksPage.fxml"));
//            Pane.getChildren().setAll(load);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    @FXML
    void btnEntreeSnacks(ActionEvent event) {
        try {
            Pane load = FXMLLoader.load(ResturantApplication.class.getResource("/view/entreeSnacksPage.fxml"));
            Pane.getChildren().setAll(load);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnPizza(ActionEvent event) {
//        try {
//            Pane load = FXMLLoader.load(ResturantApplication.class.getResource("/view/pizza.fxml"));
//            Pane.getChildren().setAll(load);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    @FXML
    void btnSalads(ActionEvent event) {
//        try {
//            Pane load = FXMLLoader.load(ResturantApplication.class.getResource("/view/saladsBurgers,Mains.fxml"));
//            Pane.getChildren().setAll(load);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    @FXML
    void menuExit(MouseEvent event) {
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            Pane load = FXMLLoader.load(ResturantApplication.class.getResource("/view/entreeSnacksPage.fxml"));
            Pane.getChildren().setAll(load);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
