package main.java.javafxapplication.Controller.Tizme;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class ListTizmeController {
    public TableColumn tizmeName;
    public TableView tableView1;

    TizmeProxy sellerProxy = new TizmeProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tizmeName.setCellValueFactory(new PropertyValueFactory<Tizme, String>("tizmename"));

    }

    public void textTolukta(ActionEvent actionEvent) {
        List<Tizme> sellers = Arrays.asList(sellerProxy.getTizme());

        tableView1.getItems().setAll(tizmeler);
    }


}
